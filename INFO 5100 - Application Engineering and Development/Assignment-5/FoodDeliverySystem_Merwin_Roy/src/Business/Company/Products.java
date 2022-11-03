/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Company;

/**
 *
 * @author merwinroy
 */

public class Products {
    
    //Product name 
    String productName;
    
    //Product price 
    int productPrice;

    //Retrieve product name
    public String getProductName() 
    {
        return productName;
    }

    //Set product name
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    //Retrieve product price
    public int getProductPrice() 
    {
        return productPrice;
    }

    //Set product price
    public void setProductPrice(int productPrice) 
    {
        this.productPrice = productPrice;
    }
    
    @Override
    public String toString()
    {
        return productName;
    }
}
