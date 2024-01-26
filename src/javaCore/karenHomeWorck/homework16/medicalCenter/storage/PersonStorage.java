package javaCore.karenHomeWorck.homework16.medicalCenter.storage;

import javaCore.karenHomeWorck.homework16.medicalCenter.model.Doctor;

public class PersonStorage {

    PersonStorage[] storages = new PersonStorage[10];
    int size;

    private void extend() {
        PersonStorage[] tmp = new PersonStorage[storages.length + 10];
        System.arraycopy(storages, 0, tmp, 0, size);
        storages = tmp;
    }

    public Doctor getDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) storages[i];
            if (doctor.getId().equals(doctorId)) {
                return doctor;
            }
        }
        return null;
    }

    public void addDoctor(Doctor doctorById) {
        if (size == storages.length) {
            extend();
        }
        storages[size++] = doctorById;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) storages[i];
            System.out.println(doctor);
        }
    }

    public Doctor getDoctorByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) storages[i];
            if (doctor.getProfession().equals(doctorProfession)) {
                return doctor;
            }
        }
        return null;
    }

    public void deleteDoctorById(Doctor doctorStr) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) storages[i];
            if (doctor.equals(doctorStr)) {
                storages[i] = storages[i + 1];
            }
        }
        size--;
    }
}
