/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import ecosystem
import Business.EcoSystem;

//import organization
import Business.Organization;

//Import company
import Business.Company.Company;

//Import useraccount
import Business.UserAccount.UserAccount;

//Import java swing panel
import javax.swing.JPanel;

//Import deliveryagent work panel
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author merwinroy
 */
public class DeliveryManRole extends Role 
{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Company company, EcoSystem ecoSystem) 
    {
        return new DeliveryManWorkAreaJPanel(container,account,organization,company,ecoSystem);//To change body of generated methods, choose Tools | Templates.
    }
    
}
