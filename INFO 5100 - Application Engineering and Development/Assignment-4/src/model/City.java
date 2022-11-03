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

public class City {
    ArrayList<Community> communityList;
    
    public City(){
        this.communityList = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addNewCommunity()
    {
        Community newCommunity = new Community();
        communityList.add(newCommunity);
        return newCommunity;
    }
    
    public void deleteCommunity(Community community){
        communityList.remove(community);
    }
}
