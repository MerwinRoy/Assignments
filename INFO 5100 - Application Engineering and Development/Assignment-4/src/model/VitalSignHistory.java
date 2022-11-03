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
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> vitalSignHistory;
    private ArrayList<VitalSigns> abnormalCaseList;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public ArrayList<VitalSigns> getAbnormalCaseList() {
        return abnormalCaseList;
    }

    public void setAbnormalCaseList(ArrayList<VitalSigns> abnormalCaseList) {
        this.abnormalCaseList = abnormalCaseList;
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVitals = new VitalSigns();
        vitalSignHistory.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(VitalSigns vitals){
        vitalSignHistory.remove(vitals);
    }
    
    public ArrayList<VitalSigns> getAbnormalCaseList(double minBloodPressure, double maxBloodPressure)
    {
        ArrayList<VitalSigns> abnormalCaseList = new ArrayList<>();
        for(VitalSigns vitals: vitalSignHistory)
        {
            if(vitals.getBloodPressure()>maxBloodPressure || vitals.getBloodPressure()<minBloodPressure)
            {
                abnormalCaseList.add(vitals);
            }
        }
        return abnormalCaseList;
    }
    
    
}
