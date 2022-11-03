/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import Ecosystem
import Business.EcoSystem;

//Import organization
import Business.Organization;

//Import company
import Business.Company.Company;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import admin work area panel
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

//Import java swing panel
import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */
public class AdminRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account,Organization organization, Company company, EcoSystem ecoSystem) 
    {
        return new AdminWorkAreaJPanel(container, account, organization, company,ecoSystem);
    }   
    
}
