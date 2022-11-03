/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author merwinroy
 */
public class TestRequest extends WorkRequest
{
    
    private String Result;

    //Retrieve result
    public String getResult() 
    {
        return Result;
    }

    //Set result
    public void setResult(String Result) 
    {
        this.Result = Result;
    }
    
    
}
