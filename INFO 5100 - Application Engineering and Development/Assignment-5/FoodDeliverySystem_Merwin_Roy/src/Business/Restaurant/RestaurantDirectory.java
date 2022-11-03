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

//Import Organization
import Business.Organization;

//Import ArrayList
import java.util.ArrayList;


public class RestaurantDirectory 
{
    //ArrayList of organization
    private ArrayList<Organization> organizationDir;
    
    //Restaurant directory constructor
    public RestaurantDirectory()
    {
        organizationDir = new ArrayList();
    }

    //Retrieve organization directory
    public ArrayList<Organization> getOrganizationDir() 
    {
        return organizationDir;
    }

    //Set organization directory
    public void setOrganizationDir(ArrayList<Organization> organizationDir) 
    {
        this.organizationDir = organizationDir;
    }
    
    //Add organization into directory
    public Organization newOrganization(Organization.Type type)
    {
        Organization org = null;
        
        if (type.getValue().equals(Organization.Type.RestaurantAdmin.getValue())){
            
            org = new Restaurant();
            
            organizationDir.add(org);
        }
        return org;
    }
    
    //Search organization from directory
    public Organization findOrganization(String nameOfOrganization){
        for(Organization org: organizationDir)
        {
            if(org.getName().equals(nameOfOrganization))
            {
                return org;
            }
        }
        return null;
    }
}
