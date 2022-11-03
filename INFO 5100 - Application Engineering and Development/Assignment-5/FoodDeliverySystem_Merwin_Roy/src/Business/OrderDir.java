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

//Import ArrayList
import java.util.ArrayList;


public class OrderDir {
    
    //ArrayList of orders
    private ArrayList<Order> orderList;
    
    //Order directory constructor
    public OrderDir()
    {
        orderList = new ArrayList();
    }

    //Retrieve order list
    public ArrayList<Order> getOrderList() 
    {
        return orderList;
    }

    //Set Order list
    public void setOrderList(ArrayList<Order> orderList) 
    {
        this.orderList = orderList;
    }
    
    //Add Order to order list
    public Order newOrder()
    {
        //Create order object
        Order order = new Order();
        
        //Add order to list
        orderList.add(order);
        
        return order;
    }
    
    //Remove order from order list
    public void deleteOrder(Order order)
    {
        //remove order from list
        orderList.remove(order);
    }
}
