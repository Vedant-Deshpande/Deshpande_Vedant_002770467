/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sakshi Sasalate
 */
public class Person {
    private String name;
    private int age;
    private int id;
    private String gender;
    private String illness;
    private Resident residence;
    private boolean isPatient;
    private String pastIllness;
    private double hb;
    private double bloodPressure;
    private  ArrayList<Encounter> encounterHistory;
    private static int count =0;

    @Override
    public String toString() {
        return name;
    }
    
    
    public Person() {
        count++;
        this.id = count;
    }
    
    public Person(String name, int age, String gender, String illness, String pastIllness, Resident residence, boolean isPatient, double bloodPressure, double hb) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
        this.pastIllness = pastIllness;
        this.residence = residence;
        this.isPatient = isPatient;
        this.bloodPressure = bloodPressure;
        this.hb = hb;
        this.encounterHistory = new ArrayList<>();
    }
    
    public Person(String name, int age, String gender, String illness, String pastIllness, Resident residence, boolean isPatient, double bloodPressure, double hb, ArrayList<Encounter> encounterHistory) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
        this.pastIllness = pastIllness;
        this.residence = residence;
        this.isPatient = isPatient;
        this.bloodPressure = bloodPressure;
        this.hb = hb;
        this.encounterHistory = encounterHistory;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getPastIllness() {
        return pastIllness;
    }

    public void setPastIllness(String pastIllness) {
        this.pastIllness = pastIllness;
    }

    public Resident getResidence() {
        return residence;
    }

    public void setResidence(Resident residence) {
        this.residence = residence;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getHB() {
        return hb;
    }

    public void setHB(double hb) {
        this.hb = hb;
    }
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

 
    
}
