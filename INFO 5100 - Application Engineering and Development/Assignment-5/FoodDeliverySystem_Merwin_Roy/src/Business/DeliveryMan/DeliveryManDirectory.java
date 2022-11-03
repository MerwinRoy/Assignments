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

//Import ArrayList
import java.util.ArrayList;



public class DeliveryManDirectory 
{
    //ArrayList of organization
    private ArrayList<Organization> organizationDir;
    
    //DeliveryAgent directory constructor
    public DeliveryManDirectory()
    {
        organizationDir = new ArrayList();
    }

    //Retrieve organization directory
    public ArrayList<Organization> getOrganizationDir() 
    {
        return organizationDir;
    }

    //Set organization directory
    /*public void setOrganizationDir(ArrayList<Organization> organizationDir) 
    {
        this.organizationDir = organizationDir;
    }*/
    
    //delete delivery agent from organization directory
    public void deleteDeliveryPerson(DeliveryMan deliveryMan)
    {
        organizationDir.remove(deliveryMan);
    }
    
    //add new organization into directory
    public Organization newOrganization(Organization.Type type)
    {
        Organization org = null;
        
        if (type.getValue().equals(Organization.Type.DeliveryMan.getValue()))
        {
            
            org = new DeliveryMan();
            
            organizationDir.add(org);
            
        }
        
        return org;
    }
    
    //Search organization
    public Organization findOrganization(String nameOfOrganization)
    {
        for(Organization organization: organizationDir)
        {
            if(organization.getName().equals(nameOfOrganization))
            {
                return organization;
            }
        }
        
        return null;
    }
}
