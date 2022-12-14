/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 5567
 */
public class House {
    private String address;
    private String aptNo;
    private String state;
    private Community community;
    private City city;
    private int pin;
    
    public House(String add, String apt, String st, Community community,City c, int pin){
        
        
        this.address = add;
        this.aptNo = apt;
        this.state = st;
        this.city = c;
        this.community = community;
        this.pin = pin;
        java.lang.System.out.println("house"+this.address + this.aptNo);
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
