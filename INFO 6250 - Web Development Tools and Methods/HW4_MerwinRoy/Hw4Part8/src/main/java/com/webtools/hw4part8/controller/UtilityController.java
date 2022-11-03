/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part8.controller;

import com.webtools.hw4part8.pojo.Utility;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author merwinroy
 */
public class UtilityController extends AbstractController {
    
    public UtilityController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Utility util = (Utility) this.getApplicationContext().getBean("view");
        request.setAttribute("string",util.fetchString());
        request.setAttribute("scope",util);
        return new ModelAndView("view");
    }
    
}
