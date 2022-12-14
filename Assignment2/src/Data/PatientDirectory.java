/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Encounter;
import Model.Patient;
import java.util.ArrayList;

/**
 *
 * @author 5567
 */
public class PatientDirectory {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatients(Patient patient) {
        patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void encounterPatient(int id, Encounter enc) {

        for (Patient v : patients) {

            if (v.getId() == id) {
                v.getEncounterHistory().addEncounter(enc);
                return;
            }
        }
        return;
    }

    public void deletePatient(int id) {
        for (Patient v : patients) {

            if (v.getId() == id) {
                patients.remove(v);
                return;
            }
        }
    }

    public Patient searchPatient(int txtId) {

        for (Patient v : patients) {
            if (v.getId() == txtId) {
                return v;
            }
        }
        return null;

    }
}
