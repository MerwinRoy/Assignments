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

public class House {
    private String streetName;
    private int houseNumber;
    private String city;
    private String community;
    private long zip;
    ArrayList<Person> familyMembers;
    
    
    public House(){
        
    }
    
    public House(String streetName, int houseNumber, String city, String community, long zip){
        familyMembers = new ArrayList<>();
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.community = community;
        this.zip= zip;
    }

    public ArrayList<Person> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(ArrayList<Person> familyMembers) {
        this.familyMembers = familyMembers;
    }
    
    

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }
    
    
    
    
}
