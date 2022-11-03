/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//Import useraccount
import Business.UserAccount.UserAccount;

//Import date
import java.util.Date;

/**
 *
 * @author merwinroy
 */

public abstract class WorkRequest 
{

    private String message;
    
    private UserAccount sender;
    
    private UserAccount receiver;
    
    private String status;
    
    private Date requestDate;
    
    private Date resolveDate;
    
    //WorkRequest constructor
    public WorkRequest()
    {
        requestDate = new Date();
    }

    //Retrieve message
    public String getMessage() 
    {
        return message;
    }

    //Set message
    public void setMessage(String message) 
    {
        this.message = message;
    }

    //Retrieve sender
    public UserAccount getSender() 
    {
        return sender;
    }

    //Set sender
    public void setSender(UserAccount sender) 
    {
        this.sender = sender;
    }

    //Retrieve receiver
    public UserAccount getReceiver() 
    {
        return receiver;
    }

    //Set receiver
    public void setReceiver(UserAccount receiver) 
    {
        this.receiver = receiver;
    }

    //Retrieve status
    public String getStatus() 
    {
        return status;
    }

    //Set status
    public void setStatus(String status) 
    {
        this.status = status;
    }

    //Retrieve request date
    public Date getRequestDate() 
    {
        return requestDate;
    }

    //Set request date
    public void setRequestDate(Date requestDate) 
    {
        this.requestDate = requestDate;
    }

    //Retrieve resolve date
    public Date getResolveDate()
    {
        return resolveDate;
    }

    //Set resolve date
    public void setResolveDate(Date resolveDate)
    {
        this.resolveDate = resolveDate;
    }
}
