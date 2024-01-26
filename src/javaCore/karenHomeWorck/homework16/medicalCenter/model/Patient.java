package javaCore.karenHomeWorck.homework16.medicalCenter.model;

import javax.xml.crypto.Data;

public class Patient extends Person {

    private Doctor doctor;
    private Data registerDateTime;


    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Data registerDateTime) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Data getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Data registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (getDoctor() != null ? !getDoctor().equals(patient.getDoctor()) : patient.getDoctor() != null) return false;
        return getRegisterDateTime() != null ? getRegisterDateTime().equals(patient.getRegisterDateTime()) : patient.getRegisterDateTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getDoctor() != null ? getDoctor().hashCode() : 0;
        result = 31 * result + (getRegisterDateTime() != null ? getRegisterDateTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}
