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

public class Community {
    ArrayList<House> houseList;
    private String communityName;
    
    public Community(){
        this.houseList = new ArrayList<>();
    }
    
    public Community(String communityName)
    {
       this.houseList = new ArrayList<>();
       this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    public House addNewHouse(){
        House newHouse = new House();
        houseList.add(newHouse);
        return newHouse;
    }
    
    public void deleteHouse(House house){
        houseList.remove(house);
    }
    
}
