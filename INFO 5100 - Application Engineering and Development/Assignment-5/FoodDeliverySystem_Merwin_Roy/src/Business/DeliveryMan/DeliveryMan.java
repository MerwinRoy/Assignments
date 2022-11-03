/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author merwinroy
 */

//Import organization
import Business.Organization;

//Import Roles
import Business.Role.Role;
import Business.Role.DeliveryManRole;

//Import ArrayList
import java.util.ArrayList;

public class DeliveryMan extends Organization 
{
    //DeliveryMan constructor
    public DeliveryMan()
    {
        
        super(Organization.Type.DeliveryMan.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        
        ArrayList<Role> roleList = new ArrayList();
        
        roleList.add(new DeliveryManRole());
        
        return roleList;
        
    }
}
