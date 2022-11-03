/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author merwinroy
 */

//Importing products
import Business.Company.Products;

//Importing ArrayList
import java.util.ArrayList;

public class Order {
    
    //Order,Restaurant details
    private int orderId;
    private String resName;
    private String orderStatus;
    
    //Delivery Agent object
    private int deliveryPersonId;
    private String deliveryPersonName;
    private String deliveryPersonUser;
    
    //Customer Details
    private int customerID;
    private String customerName;
    private String customerUser;
    private String notes;
    private String feedback;
    
    //ArrayList of products
    private ArrayList<Products> productList;
    
    //OrderID counter
    private static int orderCounter = 1;
    
    //Order Constructor
    public Order()
    {
        
        orderId = orderCounter;
        
        //Incrementing the counter
        orderCounter++;
        
        productList = new ArrayList<Products>();
    }

    //Retrieve Order Id
    public int getOrderId()
    {
        return orderId;
    }

    //Set Order Id
    public void setOrderId(int orderId) 
    {
        this.orderId = orderId;
    }

    //Retrieve restaurant name
    public String getResName() 
    {
        return resName;
    }

    //Set restaurant name
    public void setResName(String resName) 
    {
        this.resName = resName;
    }

    //Retrieve Delivery agent ID
    public int getDeliveryPersonId() 
    {
        return deliveryPersonId;
    }

    //Set Delivery person ID
    public void setDeliveryPersonId(int deliveryPersonId) 
    {
        this.deliveryPersonId = deliveryPersonId;
    }

    //Retrieve Delivery agent name
    public String getDeliveryPersonName() 
    {
        return deliveryPersonName;
    }

    //Set Delivery Agent name
    public void setDeliveryPersonName(String deliveryPersonName) 
    {
        this.deliveryPersonName = deliveryPersonName;
    }

    //Retrieve delivery Agent username
    public String getDeliveryPersonUser() 
    {
        return deliveryPersonUser;
    }

    //Set delivery agent username
    public void setDeliveryPersonUser(String deliveryPersonUser) 
    {
        this.deliveryPersonUser = deliveryPersonUser;
    }

    //Retrieve customer ID
    public int getCustomerID()
    {
        return customerID;
    }

    //Set Customer ID
    public void setCustomerID(int customerID) 
    {
        this.customerID = customerID;
    }

    //Retrieve customer name
    public String getCustomerName() 
    {
        return customerName;
    }

    //Set Customer name
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    //Retrieve Customer username
    public String getCustomerUser() 
    {
        return customerUser;
    }

    //Set customer username
    public void setCustomerUser(String customerUser)
    {
        this.customerUser = customerUser;
    }

    //Retrieve notes
    public String getNotes() 
    {
        return notes;
    }

    //Set notes
    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    //Retrieve feedback
    public String getFeedback() 
    {
        return feedback;
    }

    //Set feedback
    public void setFeedback(String feedback) 
    {
        this.feedback = feedback;
    }

    //Retrieve product list
    public ArrayList<Products> getProductList() 
    {
        return productList;
    }

    //Set product list
    public void setProductList(ArrayList<Products> productList)
    {
        this.productList = productList;
    }

    //Retrieve Order counter
    public static int getOrderCounter() 
    {
        return orderCounter;
    }

    //Set order counter
    public static void setOrderCounter(int orderCounter)
    {
        Order.orderCounter = orderCounter;
    }

    //Retrieve order status
    public String getOrderStatus() 
    {
        return orderStatus;
    }

    //Set order status
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }
    
    
    //add products to product list
    public Products addProducts()
    {
        //Create product object
        Products product = new Products();
        
        //Add product into list
        productList.add(product);
        
        return product;
    }
    
    //Remove products from product list
    public void deleteProducts(Products product)
    {
        //Remove products from list
        productList.remove(product);
    }
    
    @Override
    public String toString()
    {
        return Integer.toString(this.orderId);
    }
}
