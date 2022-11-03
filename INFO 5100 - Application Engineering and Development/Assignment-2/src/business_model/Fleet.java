/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_model;

/**
 *
 * @author merwinroy
 */

import java.util.ArrayList;

public class Fleet {
    //List of vehicles stored in ArrayList 'vehicleList'
    private ArrayList<Vehicle> vehicleList;
    
    //List of Manufacturers stored in ArrayList 'mf_list'
    private ArrayList<Vehicle> mf_list;
    
    //Constructor of class Fleet, creates new ArrayList to stores vehicles
    public Fleet() {
        this.vehicleList = new ArrayList<>();
    }

    //Getter method to retrieve ArrayList of vehicles
    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    //Setter method to retrieve ArrayList of vehicles
    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    //Getter method of manufacturer's ArrayList
    public ArrayList<Vehicle> getMf_list() {
        return mf_list;
    }
    
    //Parameterized getter method of manufacturer's ArrayList
    public ArrayList<Vehicle> getMf_list(int yearOfManufacture) {
        //ArrayList to store vehicles with matching yearOfManufacture
        ArrayList<Vehicle> mf_list = new ArrayList<>();
        
        //Loop through list of vehicles
        for(Vehicle vehicle:vehicleList)
        {
            //Add vehicle to list if vehicle's manufacturing year is same as parameter's passed
           if(vehicle.getYearOfManufacture() == yearOfManufacture)
           {
                mf_list.add(vehicle);
           } 
        }
        return mf_list;
    }

    //Parameterized Setter method that takes ArrayList of vehicles
    public void setMf_list(ArrayList<Vehicle> mf_list) {
        this.mf_list = mf_list;
    }
    
    //Function to add vehicle to the list of vehicles
    public Vehicle addVehicle(){
        //New Vehicle object is created
        Vehicle vehicle = new Vehicle();
        
        //add function used to insert vehicle object into vehicleList
        vehicleList.add(vehicle);
        return vehicle;
    }
    
    //Function to delete a vehicle object from vehicleList
    public void deleteVehicle(Vehicle vehicle){
        //remove function is used to remove object from list
        vehicleList.remove(vehicle);
    }
    
    //Function to retrieve vehicle with a specific serial number passed into arguments
    public ArrayList<Vehicle> getListOfSerial(int serial){
    
        //ArrayList created to store vehicle object with required serial number
        ArrayList<Vehicle> mfglist = new ArrayList<>();
    
        //For loop to iterate through all vehicle objects in vehicle List
        for(Vehicle vehicle : vehicleList){
            //Condition to check serial number
            if(vehicle.getSerial()== serial){
                //Add vehicle object to list that satisfies the condition
                mfglist.add(vehicle);
            }
        
            }
            //Return list
            return mfglist;
    }
 
    //Function to retrieve a list of vehicle manufactured by manufacturers passed in argument
    public ArrayList<Vehicle> getManufacturersList(String manufacturer){
        //ArrayList created to store vehicles with required manufacturer in a list
        ArrayList<Vehicle> manufacturerList = new ArrayList<>();
    
        //For loop to iterate through all vehicle objects in vehicle list 
        for(Vehicle vehicle : vehicleList){
            //Condition to check manufacturer of vehicle with objects in list
            if(vehicle.getManufacturer().equals(manufacturer)){
            // Add vehicle object to list that satisfies the above condition
            manufacturerList.add(vehicle);
            }
        }
        //return list
        return manufacturerList;
    }

    //Function to retrieve arraylist of vehicles with specific model passed into arguments
    public ArrayList<Vehicle> getListOfModels(String model){
        //ArrayList created to store vehicle objects of specific model
        ArrayList<Vehicle> modelList = new ArrayList<>();
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle : vehicleList){
            //Condition to check model of vehicle with objects in list
            if(vehicle.getModel().equals(model)){
                // Add vehicle to list that satisfies the above condition
                modelList.add(vehicle);
            }
        }
    //Return list
        return modelList;
    }
    
    //Function to retrieve vehicles without maintainance certificates
    public ArrayList<Vehicle> getCertificateNeg(){
        //ArrayList to store vehicle objects without certificates
        ArrayList<Vehicle> cert_List = new ArrayList<>();
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle: vehicleList){
            //Condition to check absence of certificate for a vehicle object
            if(vehicle.isCertificate() == false)
                //Add vehicles to list that satisfy the condition
                cert_List.add(vehicle);
         }
        //Return the list
        return cert_List;
    }
    
    //Function to retrieve vehicles with maintainance certificates
    public ArrayList<Vehicle> getCertificatePos(){
        
        //ArrayList to store vehicle objects with certificates
        ArrayList<Vehicle> cert_List = new ArrayList<>();
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle: vehicleList){
            //Condition to check presence of certificate for a vehicle object
            if(vehicle.isCertificate() == true)
                //Add vehicles to list that satisfy the condition
                cert_List.add(vehicle);
         }
        //Return the list
        return cert_List;
    }
     
    
    //Function to retrieve vehicles that are available in a given city
    public ArrayList<Vehicle> getAvail_by_City(String avail_by_city){
       //ArrayList created to store vehicle objects in a given city
       ArrayList<Vehicle> cityList = new ArrayList<>();
       //For loop to iterate through vehicle objects in vehicleList
       for(Vehicle vehicle: vehicleList){
           //Condition to check if a vehicle object is available in a city
            if(vehicle.getCity().equals(avail_by_city) && vehicle.isAvail()==true)
               //Add vehicle objects into list that satisfy the condition
               cityList.add(vehicle);
           
        }
       //Return list
       return cityList;
    }
    
    //Function to retrieve total number of vehicles that are available
    public ArrayList<Vehicle> getTotalAvail(){
        //ArrayList to store vehicle objects that are available
        ArrayList<Vehicle> totalAvail = new ArrayList<>();
              
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle: vehicleList){
            //Condition to check if a vehicle object is available
            if(vehicle.isAvail()==true)
                //Add vehicle objects to list that satisfy the condition
                totalAvail.add(vehicle);
            }
        //Return list
        return totalAvail;
    }
       
    //Function to retrieve total number of vehicles that are unavailable
    public ArrayList<Vehicle> getTotalUnAvail(){
        //ArrayList to store vehicle objects that are unavailable
        ArrayList<Vehicle> totalUnavail = new ArrayList<>();
        
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle: vehicleList){
            //Condition to check if a vehicle object is unavailable
            if(vehicle.isAvail()==false)
                //Add vehicle objects to list that satisfy the condition
                totalUnavail.add(vehicle);
            }
        //Return the list
        return totalUnavail;
    }

    //Function to get first available vehicle in a list
    public ArrayList<Vehicle> getFirstAvail(){
        //ArrayList to store vehicle object that is inserted first (first available)
        ArrayList<Vehicle> firstAvail=new ArrayList<>();
        
        //For loop to iterate through vehicle objects in vehicleList
        for(Vehicle vehicle: vehicleList){
            //Condition to check if a vehicle is available 
            if(vehicle.isAvail()==true)
                //Add vehicle object to list if condition is satisfied
                firstAvail.add(vehicle);
                //break out of loop since only one vehicle object is needed
                break;
        }
        //return the list
        return firstAvail;
    }
        
        
    //Function to retrieve vehicles that have seats in range of max_seats and min_seats set by user 
    public ArrayList<Vehicle> getSeatsList(int max_num_seats, int min_num_seats){
        //ArrayList to store vehicle object with seats satisfying the condition
        ArrayList<Vehicle> seatList = new ArrayList<>();
        //For loop to iterate through vehicle objects in vehicleList
            for(Vehicle vehicle : vehicleList){
                //Condition to check if seats in a vehicle object is within the range of max-seats and min-seats
                if(vehicle.getMax_num_seats()<=max_num_seats && vehicle.getMin_num_seats()>=min_num_seats){
                    //Add vehicle objects to list that satisfy the condition
                    seatList.add(vehicle);
            }
        }  
        //Return the list
        return seatList;
    }

    //Function to get a list of manufacturers of vehicles present in the system
    public ArrayList<String> AllManufacturers(){
        //ArrayList to store manufacturers of vehicle objects
        ArrayList<String> allManufacturersList = new ArrayList<>();
           //For loop to iterate through vehicle objects in vehicleList
           for(Vehicle vehicle: vehicleList){
            
            //Condition to check whether a manufacture name has been entered by user or not
            if(vehicle.getManufacturer()!="")
                //Add manufacturers into list that satisfy the condition
                allManufacturersList.add(vehicle.getManufacturer());
        }
        //Return the list
        return allManufacturersList;
    }
    
    
}
