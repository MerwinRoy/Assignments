/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author merwinroy
 */

import java.util.ArrayList;

public class EncounterHistory {
    private ArrayList<Encounter> encounterList;
    
    
    public EncounterHistory()
    {
        this.encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter encounter){
        encounterList.remove(encounter);
    }
    
    public ArrayList<Encounter> getEncounterByID(int id){
        ArrayList<Encounter> idList = new ArrayList<>();
        
        for(Encounter encounter:encounterList)
        {
            if(encounter.getPatient().getPatientID()==id)
            {
                idList.add(encounter);
            }
        }
        return idList;
    }
}
