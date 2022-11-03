/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part6.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author merwinroy
 */
@Controller
public class StoreController extends AbstractController {
    
    public StoreController() {
    }
    
    @RequestMapping(value={"/index.htm","/Computers.htm","/Music.htm","/Books.htm","/DisplayCart.htm","/RemoveCart.htm","/ItemCart.htm"},method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            
            PrintWriter out = response.getWriter();
            
            if(request.
                    getServletPath().
                    equals("/index.htm"))
            {
                return new ModelAndView("index");   
            }
            
            if(request.
                    getServletPath().
                    equals("/Music.htm"))
            {
                return new ModelAndView("Music");   
            }
            
            if(request.
                    getServletPath().
                    equals("/Computers.htm"))
            {
                return new ModelAndView("Computers");   
            }
            
            if(request.
                    getServletPath().
                    equals("/Books.htm"))
            {
                return new ModelAndView("Books");   
            }
            
            
            
       
            request.
                    setAttribute("Cart", request.
                            getParameter("Cart"));
            
            HttpSession Ses = request.
                    getSession(true);
            
            Enumeration<String> attrNames = Ses.
                    getAttributeNames();
            
            int i=0;
            
            while(attrNames.
                    hasMoreElements())
            {
                String attrName = (String)attrNames.
                        nextElement();
                
                if(attrName.
                        equals("Cart"))
                    
                    i=1;
            }
            
            if((Ses.
                    getAttribute("Cart")==null) && request.
                            getParameter("Cart").
                            equals("FillCart"))
            {
               
            String[] productSelected=request.
                    getParameterValues("productSelected");
            
            new ArrayList<String>(Arrays.
                    asList(productSelected));
        
            ArrayList<String> Bag = new ArrayList <String>();
            
            for(String product:productSelected)
            {
                Bag.
                        add(product);
            }
            request.
                    setAttribute("productSelected", productSelected);
            
            Ses.
                    setAttribute("Cart", Bag);
            
            return new ModelAndView("ToCart");
            } 
            
            else if((Ses.getAttribute("Cart")!=null) && request.getParameter("Cart").equals("FillCart"))
            {
               
                String[] productsSelected=request.
                        getParameterValues("productSelected");
                
                new ArrayList<String>(Arrays.
                        asList(productsSelected));
        
                 ArrayList<String> Bag = (ArrayList <String>) Ses.
                         getAttribute("Cart");
                 
            for(String product:productsSelected)
            {
                Bag.
                        add(product);
            }
            
            request.
                    setAttribute("productsSelected", productsSelected);
            
            Ses.
                    setAttribute("Cart", Bag);
            
            return new ModelAndView("ToCart");
            }
            
            if(request.
                    getParameter("Cart").
                    equals("DisplayCart"))
            {
                return new ModelAndView("DisplayCart");
            }
            
            if(request.
                    getParameter("Cart").
                    equals("RemoveCart"))
            {
                String[] productsRemove=request.
                        getParameterValues("productsRemove");
                
                new ArrayList<String>(Arrays.
                        asList(productsRemove));
                
                request.
                        setAttribute("productsRemove", productsRemove);
                
                if(Ses.
                        getAttribute("Cart")!=null)
                {
                    ArrayList<String> Bag = (ArrayList <String>) Ses.
                            getAttribute("Cart");
                    
                    for(String product:productsRemove)
                    {
                        Bag.
                                remove(product);
                    }
                }
                return new ModelAndView("RemoveSuccess");
            }
            return new ModelAndView();
    }
    
}
