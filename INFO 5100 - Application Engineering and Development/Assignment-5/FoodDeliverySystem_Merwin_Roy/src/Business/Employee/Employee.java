/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author merwinroy
 */

public class Employee {
    
    //Employee namev and id,counter details
    private String name;
    private int id;
    private static int count = 1;

    //Employee constructor
    public Employee() 
    {
        id = count;
        count++;
    }

    //Retrieve employee id
    public int getId() 
    {
        return id;
    }

    //Set employee name
    public void setName(String name) 
    {
        this.name = name;
    }

    //Retrieve employee name
    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() 
    {
        return name;
    }
    
    
}
