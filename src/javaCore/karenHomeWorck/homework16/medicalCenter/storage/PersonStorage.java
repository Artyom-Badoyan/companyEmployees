package javaCore.karenHomeWorck.homework16.medicalCenter.storage;

import javaCore.karenHomeWorck.homework16.medicalCenter.model.Doctor;
import javaCore.karenHomeWorck.homework16.medicalCenter.model.Patient;
import javaCore.karenHomeWorck.homework16.medicalCenter.model.Person;
import javaCore.karenHomeWorck.homework16.medicalCenter.model.Profession;
import javaCore.karenHomeWorck.homework16.medicalCenter.util.DateUtil;

import javax.print.Doc;
import java.util.Date;

public class PersonStorage {

    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(Profession doctorProfession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession() == doctorProfession) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                deletePersonByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }


    public void printToDaysPatients() {
        Date toDays = new Date();
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(toDays, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }

    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDateTime().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }
}
