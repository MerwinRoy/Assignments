/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//Importing roles
import Business.Role.Role;
import Business.Role.SystemAdminRole;

//Importing directory
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Company.CompanyDirectory;

//Importing ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class EcoSystem extends Organization
{
    
    //EcoSystem object
    private static EcoSystem business;
    
    //Directory Objects
    
    private CustomerDirectory customerDirectory;
    
    private DeliveryManDirectory deliveryManDirectory;
    
    private CompanyDirectory companyDirectory; 
    
    private OrderDir orderDir;


    //Private Constructor
    private EcoSystem()
    {
        
        super(null);
        // networkList=new ArrayList<Network>();
        companyDirectory = new CompanyDirectory();
        
        
        deliveryManDirectory = new DeliveryManDirectory();
        
        customerDirectory = new CustomerDirectory();
        
        orderDir = new OrderDir();
              
    }

    
    //Retrieve EcoSystem object
    public static EcoSystem getBusiness() 
    {
        return business;
    }

    //Set Business object
    public static void setBusiness(EcoSystem business) 
    {
        EcoSystem.business = business;
    }

    //Retrieve Customer directory
    public CustomerDirectory getCustomerDirectory() 
    {
        return customerDirectory;
    }

    //Set Customer directory
    public void setCustomerDirectory(CustomerDirectory customerDirectory) 
    {
        this.customerDirectory = customerDirectory;
    }

    //Retrieve Delivery Agent Directory
    public DeliveryManDirectory getDeliveryManDirectory()
    {
        return deliveryManDirectory;
    }

    //Set Delivery Agent Directory
    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) 
    {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    //Retrieve Company directory
    public CompanyDirectory getCompanyDirectory() 
    {
        return companyDirectory;
    }

    //Set Company directory
    public void setCompanyDirectory(CompanyDirectory companyDirectory) 
    {
        this.companyDirectory = companyDirectory;
    }

    //Retrieve order directory
    public OrderDir getOrderDir() 
    {
        return orderDir;
    }

    //Set Order directory
    public void setOrderDir(OrderDir orderDir) 
    {
        this.orderDir = orderDir;
    }
    
    
    
    public static EcoSystem getInstance()
    {
        if(business==null)
        {
            
            business=new EcoSystem();
            
        }
        
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        
        ArrayList<Role> roleList=new ArrayList<Role>();
        
        roleList.add(new SystemAdminRole());
        
        return roleList;
    }
    
    //Function to check unique user
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }
}
