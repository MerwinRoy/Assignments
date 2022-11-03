/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

//Import employee
import Business.Employee.Employee;

//Import role
import Business.Role.Role;

//Import ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */

public class UserAccountDirectory 
{
    
    //List of user accounts
    private ArrayList<UserAccount> userAccountList;

    //user account directory constructor
    public UserAccountDirectory() 
    {
        userAccountList = new ArrayList();
    }

    //retrieve user account
    public ArrayList<UserAccount> getUserAccountList() 
    {
        return userAccountList;
    }
    
    //Function to authenticate user
    public UserAccount authenticateUser(String username, String password)
    {
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password))
            {
                return ua;
            }
        return null;
    }
    
    //Create User account
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role)
    {
        UserAccount userAccount = new UserAccount();
        
        userAccount.setUsername(username);
        
        userAccount.setPassword(password);
        
        userAccount.setEmployee(employee);
        
        userAccount.setRole(role);
        
        userAccountList.add(userAccount);
        
        return userAccount;
    }
    
    //Delete account
    public void deleteAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
    
    //Validate unique user
    public boolean checkIfUsernameIsUnique(String username)
    {
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
