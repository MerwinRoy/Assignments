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

//Import ArrayList
import java.util.ArrayList;

public class CustomerDirectory 
{
    //ArrayList of Organization
    private ArrayList<Organization> organizationDir;
    
    //Customer directory constructor
    public CustomerDirectory()
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
    }
    */
    
    //Remove customer from organization directory
    public void deleteCustomer(Customer customer)
    {
        organizationDir.remove(customer);
    }
    
    //Add organization into directory
    public Organization newOrganization(Organization.Type type)
    {
        
      Organization organization = null;
            
      if (type.getValue().equals(Organization.Type.Customer.getValue()))
        {
            organization = new Customer();
            organizationDir.add(organization);
        }
      
        return organization;
        
    }
    
    //Search organization from directory
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
