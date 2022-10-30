/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.PatientDirectory;
import Data.PersonDirectory;

/**
 *
 * @author 5567
 */
public class System {
    private PatientDirectory patientList;
    private PersonDirectory personList;
    private City city;
    
    public System(){
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
    }
    
    
    
    public void addPerson(Person p){
        personList.addPerson(p);
    }

    public void addPatient(Patient p){
        patientList.addPatients(p);
    }
    
    
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public Person searchUser(int txtId) {
        java.lang.System.out.println("idid:"+txtId);
        return personList.searchUser(txtId);
    }

    public void encounterPatient(int id, Encounter enc) {
        patientList.encounterPatient(id, enc);
    }

    public void deletePerson(int id) {
        personList.deletePerson(id);
    }

    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }
    
      public Patient searchPatient(int txtId) {
        return patientList.searchPatient(txtId);
    }
}
