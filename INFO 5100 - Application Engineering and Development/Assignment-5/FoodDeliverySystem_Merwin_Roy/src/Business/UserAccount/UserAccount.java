/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 * @author merwinroy
 */

//Import role
import Business.Role.Role;

//Import employee
import Business.Employee.Employee;

//Import work queue
import Business.WorkQueue.WorkQueue;

public class UserAccount 
{
    //useraccount details
    private String username;
    private String password;
    
    //Employee details
    private Employee employee;
    private Role role;
    
    private WorkQueue workQueue;

    //UserAccount constructor
    public UserAccount() 
    {
        workQueue = new WorkQueue();
    }
    
    //Retrieve username
    public String getUsername() 
    {
        return username;
    }

    //Set username
    public void setUsername(String username) 
    {
        this.username = username;
    }

    //Retrieve password
    public String getPassword()
    {
        return password;
    }

    //Set password
    public void setPassword(String password) 
    {
        this.password = password;
    }

    //Retrieve role
    public Role getRole() 
    {
        return role;
    }

    //Set employee
    public void setEmployee(Employee employee) 
    {
        this.employee = employee;
    }

    //Set role
    public void setRole(Role role) 
    {
        this.role = role;
    }

    //Retrieve employee
    public Employee getEmployee() 
    {
        return employee;
    }

    //Retrieve workQueue
    public WorkQueue getWorkQueue() 
    {
        return workQueue;
    }

    
    
    @Override
    public String toString() 
    {
        return username;
    }
    
    
    
}