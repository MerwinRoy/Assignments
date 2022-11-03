/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import ecosystem
import Business.EcoSystem;

//Import company
import Business.Company.Company;

//Import organization
import Business.Organization;

//Import user account
import Business.UserAccount.UserAccount;

//Import panel
import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */

public abstract class Role 
{
    //Enum type of roles
    public enum RoleType
    {
        
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        
        private RoleType(String value)
        {
            this.value = value;
        }

        public String getValue() 
        {
            return value;
        }

        @Override
        public String toString() 
        {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Company company,EcoSystem business);

    @Override
    public String toString() 
    {
        return this.getClass().getName();
    }
    
    
}