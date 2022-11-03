/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author merwinroy
 */

//Import organization
import Business.Organization;

//Import Roles
import Business.Role.AdminRole;
import Business.Role.Role;

//Import ArrayList
import java.util.ArrayList;


public class Restaurant extends Organization 
{
    //Restaurant constructor
    public Restaurant() 
    {
        
        super(Organization.Type.RestaurantAdmin.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        ArrayList<Role> roleList = new ArrayList();
        
        roleList.add(new AdminRole());
        
        return roleList;
    }
}
