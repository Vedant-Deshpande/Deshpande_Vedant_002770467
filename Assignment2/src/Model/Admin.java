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
public class Admin {
    private ArrayList<Person> personDirectory;
    private ArrayList<Person> patientDirectory;

//defining directories
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public ArrayList<Person> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Person> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

//operation on person
    public void addPerson(Person p){
        if(p!=null)
            personDirectory.add(p);
    }
    public void deletePerson(Person p){
        this.personDirectory.remove(p);
    }

//operation on patient
    public void addPatient(Person p) {
        if(p!=null)
            patientDirectory.add(p);
    }
    public boolean isPatient(Person p){
        return patientDirectory.contains(p);
    }

    public void deletePatient(Person p){
        this.patientDirectory.remove(p);
    }
    
}
