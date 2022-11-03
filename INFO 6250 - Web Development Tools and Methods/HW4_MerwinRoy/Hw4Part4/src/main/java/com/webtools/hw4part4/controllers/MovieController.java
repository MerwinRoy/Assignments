/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part4.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author merwinroy
 */
public class MovieController extends AbstractController {
    
    public MovieController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                
        if(request.getParameter("movieSend").equals("browse"))
        {
            return new ModelAndView("MovieView");
        }
        else if (request.getParameter("movieSend").equals("addMovies"))
        {
            return new ModelAndView("MovieAdd");
        }
        
        return new ModelAndView();
    }
    
}
