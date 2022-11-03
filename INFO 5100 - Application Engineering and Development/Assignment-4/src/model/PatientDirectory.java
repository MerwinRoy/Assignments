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

public class PatientDirectory {
    ArrayList<Patient> patientDir;
    
    public PatientDirectory() {
        this.patientDir = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public Patient addNewPatient(){
        Patient patient = new Patient();
        patientDir.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient){
        patientDir.remove(patient);
    }
    
    public ArrayList<Integer> getIDList(){
        ArrayList<Integer> idList = new ArrayList<>();
        for(Patient patient:patientDir)
        {
            idList.add(patient.getPatientID());
        }
        return idList;
    }
}
