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
import java.util.Date;

public class Encounter {
    
    public VitalSigns vitalSigns;
    
    public Patient patient;
    
    public House house;
    
    private Date admitDate;
    
    public Community community;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
   

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }
    
    public Date getAdmitDate() {
        return admitDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    
    public Encounter(VitalSigns vitals, Patient patient, House house, Community community)
    {
        this.vitalSigns = vitals;
        this.patient = patient;
        this.house = house;
        this.community = community;
        this.admitDate = new Date();
    }
    
    public Encounter(){
        this.admitDate = new Date();
    }
}
