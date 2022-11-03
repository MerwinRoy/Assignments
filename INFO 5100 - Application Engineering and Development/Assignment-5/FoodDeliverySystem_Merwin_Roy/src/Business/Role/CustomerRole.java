/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import Ecosystem
import Business.EcoSystem;

//import organization
import Business.Organization;

//Import company
import Business.Company.Company;

//Import useraccount
import Business.UserAccount.UserAccount;

//Import customer work area panel
import userinterface.CustomerRole.CustomerUsageJPanel;

//Import java swing panel
import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */
public class CustomerRole extends Role
{
    
    public JPanel createWorkArea(JPanel container, UserAccount account,Organization organization, Company company, EcoSystem ecoSystem) 
    {
        return new CustomerUsageJPanel(container, account,organization,company,ecoSystem);
    }
    
    
}
