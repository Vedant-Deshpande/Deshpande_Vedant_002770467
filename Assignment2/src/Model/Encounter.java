/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sakshi Sasalate
 */
public class Encounter {
    private String encounter;
    private String vitalSign;
    private String timeSlot;
    private String doctor;

    @Override
    public String toString() {
        return  encounter;
    }

    public Encounter(String encounter, String vitalSign, String timeSlot, String doctor) {
        this.encounter = encounter;
        this.vitalSign = vitalSign;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

   
    public String getEncounter() {
        return encounter;
    }

    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }


    
    public String getVitalsign() {
        return vitalSign;
    }

    public void setVitalsign(String vitalSign) {
        this.vitalSign = vitalSign;
    }



    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }



    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
}

