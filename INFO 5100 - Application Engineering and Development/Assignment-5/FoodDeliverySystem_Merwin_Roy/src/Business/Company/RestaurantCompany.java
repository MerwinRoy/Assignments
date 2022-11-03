/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Company;

/**
 *
 * @author merwinroy
 */

//Import role
import Business.Role.Role;

//Import ArrayList
import java.util.ArrayList;


public class RestaurantCompany extends Company
{
    //Restaurant enterprise constructor
    public RestaurantCompany(String restaurantName,String restaurantAddress)
    {
        super(restaurantName,restaurantAddress,CompanyType.Restaurant);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    }
}
