/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author merwinroy
 */

//Import organization
import Business.Organization;

//Import Role
import Business.Role.Role;
import Business.Role.CustomerRole;

//Import ArrayList
import java.util.ArrayList;


public class Customer extends Organization 
{
    //Customer constructor
    public Customer()
    {
        super(Organization.Type.Customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        ArrayList<Role> roleList = new ArrayList();
        
        roleList.add(new CustomerRole());
        
        return roleList;
    }
    
}
