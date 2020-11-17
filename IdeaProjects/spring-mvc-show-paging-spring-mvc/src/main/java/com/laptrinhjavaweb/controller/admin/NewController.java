package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.service.INewService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller(value = "newControllerOfAdmin")
public class NewController {
	
	@Autowired
	private INewService newService;

	@Autowired
    private ICategoryService categoryService;

	@RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page, 
								 @RequestParam("limit") int limit, HttpServletRequest request) {
		NewDTO model = new NewDTO();
		model.setPage(page);
		model.setLimit(limit);
		ModelAndView mav = new ModelAndView("admin/new/list");
		Pageable pageable = new PageRequest(page - 1, limit);
		model.setListResult(newService.findAll(pageable));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		mav.addObject("model", model);

		if (request.getParameter("message") != null){
			if (request.getParameter("message").equals("update_success")){
				mav.addObject("message", "Update success");
				mav.addObject("alert","success");
			}else if (request.getParameter("message").equals("insert_success")){
				mav.addObject("message", "insert success");
				mav.addObject("alert","success");
			}else if (request.getParameter("message").equals("error_system")){
				mav.addObject("message", "error system");
				mav.addObject("alert","danger");
			}
		}
		return mav;
	}
	
	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
	public ModelAndView editNew(@RequestParam(value = "id",required = false) Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		NewDTO model = new NewDTO();
		if( id != null){
			model = newService.findById(id);
		}

		if (request.getParameter("message") != null){
			if (request.getParameter("message").equals("update_success")){
				mav.addObject("message", "Update success");
				mav.addObject("alert","success");
			}else if (request.getParameter("message").equals("insert_success")){
				mav.addObject("message", "insert success");
				mav.addObject("alert","success");
			}else if (request.getParameter("message").equals("error_system")){
				mav.addObject("message", "error system");
				mav.addObject("alert","danger");
			}
		}
		mav.addObject("categories",categoryService.findAll());
		mav.addObject("model", model);
		return mav;
	}


}
