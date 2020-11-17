package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public List<String> loadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Blog java");
        menus.add("hướng dẫn java web");
        menus.add("Liên hệ");
        menus.add("Thanh toán");
        return menus;
    }
}
