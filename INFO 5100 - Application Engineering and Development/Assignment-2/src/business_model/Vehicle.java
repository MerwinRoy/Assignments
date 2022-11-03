/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_model;

import java.util.Date;

/**
 *
 * @author merwinroy
 */
public class Vehicle {
    private String manufacturer;
    private String city;
    private String model;
    private int yearOfManufacture;
    private int serial;
    private int min_num_seats;
    private int max_num_seats;
    private boolean avail;
    private boolean certificate;
    private Date createStat;
    
    //Constructor of Vehicle class
    public Vehicle(boolean avail,String manufacturer, int yearOfManufacture, int min_num_seats, int max_num_seats, int serial, String model, String city, boolean certificate)
    {
        this.avail = avail;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.min_num_seats = max_num_seats;
        this.max_num_seats = max_num_seats;
        this.serial = serial;
        this.model = model;
        this.city = city;
        this.certificate = certificate;
        
        this.createStat=new Date();
    }
    
    //Default constructor(without arguments)
    public Vehicle(){
        this.createStat = new Date();
    }

    //getter method to get manufacturer name of a vehicle object
    public String getManufacturer() {
        return manufacturer;
    }
    
    //Setter method to set the manufacturer name of a vehicle object
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //Getter method to get city name of a vehicle object
    public String getCity() {
        return city;
    }

    //Setter method to set city name of a vehicle object
    public void setCity(String city) {
        this.city = city;
    }

    //Getter method to get model name of a vehicle object
    public String getModel() {
        return model;
    }

    //Setter method to set model name of a vehicle object
    public void setModel(String model) {
        this.model = model;
    }

    //Getter method to get the manufacturing year of a vehicle object
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    //Setter method to set the manufacturing year of a vehicle object
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    //Getter method to get serial number of a vehicle object
    public int getSerial() {
        return serial;
    }

    //Setter method to set serial number of a vehicle object
    public void setSerial(int serial) {
        this.serial = serial;
    }

    //Getter method to get minimum number of seats in a vehicle object
    public int getMin_num_seats() {
        return min_num_seats;
    }

    //Setter method to set minimum number of seats in a vehicle object
    public void setMin_num_seats(int min_num_seats) {
        this.min_num_seats = min_num_seats;
    }

    //Getter method to get maximum number of seats in a vehicle object
    public int getMax_num_seats() {
        return max_num_seats;
    }

    //Setter method to set maximum number of seats in a vehicle object
    public void setMax_num_seats(int max_num_seats) {
        this.max_num_seats = max_num_seats;
    }

    //Method to check availability of a vehicle
    public boolean isAvail() {
        return avail;
    }

    //Method to set the availability status of a vehicle
    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    //Method to check certification of a vehicle
    public boolean isCertificate() {
        return certificate;
    }

    //Method to set certification of a vehicle
    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    //Method to retrive the creation statistics(date) of a vehicle object
    public Date getCreateStat() {
        return createStat;
    }

    //Method to set a date of creation of a vehicle object
    public void setCreateStat(Date createStat) {
        this.createStat = createStat;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.manufacturer);
    }
}
