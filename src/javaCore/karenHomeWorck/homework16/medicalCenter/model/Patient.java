package javaCore.karenHomeWorck.homework16.medicalCenter.model;

import javaCore.karenHomeWorck.homework16.medicalCenter.util.DateUtil;

import java.util.Date;

public class Patient extends Person {

    private Doctor doctor;
    private Date registerDateTime;


    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Date registerDateTime) {
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

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;

        if (getDoctor() != null ? !getDoctor().equals(patient.getDoctor()) : patient.getDoctor() != null) return false;
        return getRegisterDateTime() != null ? getRegisterDateTime().equals(patient.getRegisterDateTime()) : patient.getRegisterDateTime() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getDoctor() != null ? getDoctor().hashCode() : 0);
        result = 31 * result + (getRegisterDateTime() != null ? getRegisterDateTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDateTime=" + DateUtil.dateTimeToString(registerDateTime) +
                "} " + super.toString();
    }
}
