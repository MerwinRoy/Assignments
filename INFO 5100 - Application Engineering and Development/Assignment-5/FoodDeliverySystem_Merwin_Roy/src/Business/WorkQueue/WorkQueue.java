/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//Import arrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class WorkQueue 
{
    //ArrayList of workQueue
    private ArrayList<WorkRequest> workRequestList;

    //WorkQueue constructor
    public WorkQueue() 
    {
        workRequestList = new ArrayList();
    }

    //Retrive list of workqueue
    public ArrayList<WorkRequest> getWorkRequestList() 
    {
        return workRequestList;
    }
}