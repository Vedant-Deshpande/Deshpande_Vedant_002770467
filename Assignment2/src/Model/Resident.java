/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sakshi Sasalate
 */
public class Resident {
   private String House;
    private String community;
    private String city;


    public Resident(String House, String community, String city) {
        this.House = House;
        this.community = community;
        this.city = city;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
