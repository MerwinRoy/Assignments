/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class System1 {
    private PersonDirectory personDir;
    private PatientDirectory patientDir;
    
    private ArrayList<System> systemList;
    
    public System1(){
        this.systemList = new ArrayList<>();
    }

    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDirectory personDir) {
        this.personDir = personDir;
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    public ArrayList<System> getSystemList() {
        return systemList;
    }

    public void setSystemList(ArrayList<System> systemList) {
        this.systemList = systemList;
    }
    
    public System addNewSystem(){
        System newSystem = new System();
        systemList.add(newSystem);
        return newSystem;
    }
    
    public void deleteExistingSystem(System system){
        systemList.remove(system);
    }
    
    public ArrayList<System> getAbnormalCaseList(double minBloodPressure, double maxBloodPressure)
    {
        ArrayList<System> abnormalCaseList = new ArrayList<>();
        for(System system: systemList)
        {
            if(system.getBloodPressure()>maxBloodPressure || system.getBloodPressure()<minBloodPressure)
            {
                abnormalCaseList.add(system);
            }
        }
        return abnormalCaseList;
    }
    
    public ArrayList<System> getAbnormalCaseListByCommunity(double minBloodPressure, double maxBloodPressure, String communityName)
    {
        ArrayList<System> abnormalCaseList = new ArrayList<>();
        for(System system: systemList)
        {
            if(system.getCommunity().equals(communityName) && (system.getBloodPressure()>maxBloodPressure || system.getBloodPressure()<minBloodPressure))
            {
                abnormalCaseList.add(system);
            }
        }
        return abnormalCaseList;
    }
    
    public ArrayList<System> getAbnormalCaseListByCity(double minBloodPressure, double maxBloodPressure, String cityName)
    {
        ArrayList<System> abnormalCaseList = new ArrayList<>();
        for(System system: systemList)
        {
            if(system.getCity().equals(cityName) && (system.getBloodPressure()>maxBloodPressure || system.getBloodPressure()<minBloodPressure))
            {
                abnormalCaseList.add(system);
            }
        }
        return abnormalCaseList;
    }
    
    public ArrayList<System> getSystemByID(int id){
        ArrayList<System> idList = new ArrayList<>();
        
        for(System system:systemList)
        {
            if(system.getPatientID()==id)
            {
                idList.add(system);
            }
        }
        return idList;
    }
}
