/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//Importing directories
import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;

//Importing Role
import Business.Role.Role;

//Importing WorkQueue
import Business.WorkQueue.WorkQueue;

//Importing ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */


public abstract class Organization {

    //Organization name and workQueue
    private String name;
    private WorkQueue workQueue;
    
    //Directory object
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    //Organization id and counter
    private int organizationID;
    private static int counter=0;
    
    //Enum 
    public enum Type
    {
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("DeliveryMan"),
        SysAdmin("Sysadmin");
        
        private String value;
        
        private Type(String value) 
        {
            this.value = value;
        }
        
        public String getValue() 
        {
            return value;
        }
    }

    //Organization constructor (parameterized)
    public Organization(String name) 
    {
        this.name = name;
        
        workQueue = new WorkQueue();
        
        employeeDirectory = new EmployeeDirectory();
        
        userAccountDirectory = new UserAccountDirectory();
        
        organizationID = counter;
        
        ++counter;
    }
    
    //Organization constructor (default)
    public Organization()
    {
        
    }
    
    
    public abstract ArrayList<Role> getSupportedRole();
    
    //Retrieve User Account Directory
    public UserAccountDirectory getUserAccountDirectory() 
    {
        return userAccountDirectory;
    }

    //Retrieve Organization ID
    public int getOrganizationID() 
    {
        return organizationID;
    }

    //Retrieve Employee Directory
    public EmployeeDirectory getEmployeeDirectory() 
    {
        return employeeDirectory;
    }
    
    //Retrieve organization name
    public String getName()
    {
        return name;
    }

    //Retrieve workQueue
    public WorkQueue getWorkQueue()
    {
        return workQueue;
    }

    //Set name
    public void setName(String name) 
    {
        this.name = name;
    }

    //Set WorkQueue
    public void setWorkQueue(WorkQueue workQueue) 
    {
        this.workQueue = workQueue;
    }

    @Override
    public String toString()
    {
        return name;
    }
    
    
}
