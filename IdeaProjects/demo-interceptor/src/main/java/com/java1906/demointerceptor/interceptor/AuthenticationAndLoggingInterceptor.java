package com.java1906.demointerceptor.interceptor;

import com.java1906.demointerceptor.utils.TokenManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class AuthenticationAndLoggingInterceptor extends HandlerInterceptorAdapter {
    private static Logger log = LoggerFactory.getLogger(AuthenticationAndLoggingInterceptor.class);

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {

        log.info("[preHandle][" + request + "]" + "[" + request.getMethod()
                + "]" + request.getRequestURI() + getParameters(request));

        // TODO: Thấy mọi request đều gọi 2 lần ?
        // Kiểm tra request thuộc loại gì - OPTIONS trước rồi đến GET sau
        // TODO: Viết response trả về 1 friendly message như là
        // "Bạn chưa đăng nhập"
        if (request.getRequestURI().contains("login"))
            return true;

        if (TokenManager.getInstance().isAuthenticated(request.getSession().getId(), request.getHeader("AuthToken")))
            return true;
        else
            throw new Exception("403");
    }

    private String getParameters(HttpServletRequest request) {
        StringBuffer posted = new StringBuffer();
        Enumeration<?> e = request.getParameterNames();
        if (e != null) {
            posted.append("?");
        }
        while (e.hasMoreElements()) {
            if (posted.length() > 1) {
                posted.append("&");
            }
            String curr = (String) e.nextElement();
            posted.append(curr + "=");
            if (curr.contains("password")
                    || curr.contains("pass")
                    || curr.contains("pwd")) {
                posted.append("*****");
            } else {
                posted.append(request.getParameter(curr));
            }
        }
        String ip = request.getHeader("X-FORWARDED-FOR");
        String ipAddr = (ip == null) ? getRemoteAddr(request) : ip;
        if (ipAddr!=null && !ipAddr.equals("")) {
            posted.append("&_psip=" + ipAddr);
        }
        return posted.toString();
    }

    private String getRemoteAddr(HttpServletRequest request) {
        String ipFromHeader = request.getHeader("X-FORWARDED-FOR");
        if (ipFromHeader != null && ipFromHeader.length() > 0) {
            log.debug("ip from proxy - X-FORWARDED-FOR : " + ipFromHeader);
            return ipFromHeader;
        }
        return request.getRemoteAddr();
    }
}
