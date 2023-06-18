package com.example.XtramilePatient.patients;

import java.util.List;

public class PatientResponse {
    private List<Patient> patients;
    private int totalPages;

    public PatientResponse(List<Patient> patients, int totalPages) {
        this.patients = patients;
        this.totalPages = totalPages;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
