/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import ecosystem
import Business.EcoSystem;

//Import organization
import Business.Organization;

//Import company
import Business.Company.Company;

//import user account
import Business.UserAccount.UserAccount;

//Import Systemadmin work panel
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

//Import panel
import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */
public class SystemAdminRole extends Role
{
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization,Company company, EcoSystem ecoSystem) 
    {
        return new SystemAdminWorkAreaJPanel(container, ecoSystem);
    }
    
}
