package com.oserion.framework.web.controllers;


import com.oserion.framework.web.util.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class MainController {

    protected ServletContext getContext(HttpServletRequest request){
        return request.getSession().getServletContext();
    }

    protected AnnotationConfigApplicationContext getSpringContext(HttpServletRequest request){
        return (AnnotationConfigApplicationContext)
                getContext(request).getAttribute(AppConfig.PROPERTY_SPRING_CONTEXT_API);
    }
}
