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

//import organization
import Business.Organization;

//Import Restaurant directory
import Business.Restaurant.RestaurantDirectory;

//Import ArrayList
import java.util.ArrayList;

public abstract class Company extends Organization
{
    //Enterprise name and address
    private String name;
    private String address;
    
    //ArrayList of products
    private ArrayList<Products> productsList;
    
    //Type of Enterprise
    private CompanyType companyType;
    
    //Restaurant directory object
    private RestaurantDirectory restaurantDirectory;
    
    //Company constructor
    public Company(String name, String address, CompanyType type)
    {
        super(name);
        
        this.companyType=type;
        
        this.name=name;
        
        this.address = address;
        
        restaurantDirectory=new RestaurantDirectory();
        
        this.productsList =new ArrayList<>();
    }

    //Retrieve name
    public String getName() 
    {
        return name;
    }

    //Set name
    public void setName(String name) 
    {
        this.name = name;
    }

    //Retrieve address
    public String getAddress() 
    {
        return address;
    }

    //Set address
    public void setAddress(String address)
    {
        this.address = address;
    }

    //Retrieve product list
    public ArrayList<Products> getProductsList()
    {
        return productsList;
    }

    //Set product list
    public void setProductsList(ArrayList<Products> productsList)
    {
        this.productsList = productsList;
    }
    
    //Enum
    public enum CompanyType
    {
        Restaurant("Restaurant");
        
        private String value;
        
        private CompanyType(String value)
        {
            
            this.value=value;
            
        }
        public String getValue() 
        {
            
            return value;
            
        }
        
        @Override
        
        public String toString()
        {
            
        return value;
        
        }
    }

    //Retrieve Enterprise type 
    public CompanyType getCompanyType() 
    {
        return companyType;
    }

    //Set Enterprise type
    public void setCompanyType(CompanyType companyType)
    {
        this.companyType = companyType;
    }

    //Retrieve Restaurant directory
    public RestaurantDirectory getRestaurantDirectory() 
    {
        return restaurantDirectory;
    }

    //Set restaurant directory
    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory)
    {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    //Add items to list
    public Products newMenu()
    {
        //Create new item object
        Products product = new Products();
        
        //add item to list
        this.productsList.add(product);
        
        return product;
    }
    
    //Remove item from list
    public void deleteProduct(Products product)
    {
        productsList.remove(product);
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
