/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw3part3;

/**
 *
 * @author merwinroy
 */
import java.util.ListResourceBundle;  

public class MyBundle extends ListResourceBundle {  
    public Object[][] getContents() 
    {  
        return contents;  
    }  
    static final Object[][] contents = { 
            { "fruit.Mango", "Mango" },  
            { "fruit.Orange", "Orange" }, 
            { "fruit.Banana", "Banana" }, 
    };  
}  
