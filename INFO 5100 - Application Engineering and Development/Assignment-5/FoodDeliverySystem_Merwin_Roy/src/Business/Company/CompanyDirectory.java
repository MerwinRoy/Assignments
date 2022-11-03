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

//Importing ArrayList
import java.util.ArrayList;


public class CompanyDirectory 
{
    //ArrayList of Enterprise
    private ArrayList<Company> companyList;
    
    //Enterprise directory constructor
    public CompanyDirectory()
    {
        companyList = new ArrayList();
    }

    //Retrieve enterprise list
    public ArrayList<Company> getCompanyList() 
    {
        return companyList;
    }

    //Set enterprise list
    public void setCompanyList(ArrayList<Company> companyList) 
    {
        this.companyList = companyList;
    }
    
    //Add new Enterprise
    public Company newCompany(String companyName,String companyAddress,Company.CompanyType type)
    {
        Company company = null;
        
        if(type==Company.CompanyType.Restaurant)
        {
            company = new RestaurantCompany(companyName,companyAddress);
            
            //Add enterprise to list
            companyList.add(company);
        }
        
        return company;
    }
    
    //Remove enterprise from list
    public void deleteCompany(Company company)
    {
        companyList.remove(company);
    }
    
    //Search enterprise from list
    public Company findCompany(String companyName)
    {
        for(Company company:companyList)
        {
            if(company.getName().equals(companyName))
            {
                return company;
            }
        }
        return null;
    }
}
