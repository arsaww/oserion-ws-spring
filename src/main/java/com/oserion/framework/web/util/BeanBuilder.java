package com.oserion.framework.web.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oserion.framework.web.beans.HtmlFormConfig;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeanBuilder <T>{

    public T createJavaBean(HttpServletRequest r, T beanClass) throws IOException {

        // 1. get received JSON data from request
       /* BufferedReader br = new BufferedReader(new InputStreamReader(r.getInputStream()));
        String json = br.readLine();

        // 2. initiate jackson mapper
        ObjectMapper mapper = new ObjectMapper();

        // 3. Convert received JSON to Bean
        return mapper.readValue(json, BeanClass);*/
        return null;
    }

    public String createJsonString(Object o) throws IOException {

        return "";
    }

    public String createXmlString(Object o) throws IOException {

        return "";
    }

}
