package javaCore.karenHomeWorck.homework16.medicalCenter;

import javaCore.karenHomeWorck.homework16.medicalCenter.model.Doctor;
import javaCore.karenHomeWorck.homework16.medicalCenter.storage.PersonStorage;

import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String commands = scanner.nextLine();

            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                    case ADD_PATIENT:
                        personStorage.printDoctors();
                        //todo
                        System.out.println("Please input id,name,surname,phoneNumber,doctor,registerDateTime(22/01/2024 00:07)");
                        String patientDataStr = scanner.nextLine();
                        String[] patientData = patientDataStr.split(",");
                        break;

            }
        }
    }

    private static void changeDoctorData() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id");
        String doctorStr = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorStr);
        if (doctorById != null) {
            System.out.println("Please input doctor name,surname,phoneNumber,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[1]);
            doctorById.setSurname(doctorData[2]);
            doctorById.setPhoneNumber(doctorData[3]);
            doctorById.setEmail(doctorData[4]);
            doctorById.setProfession(doctorData[5]);
        } else {
            System.out.println("takoi Doctor ne naiden");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorStr = personStorage.getDoctorById(doctorId);
        if (doctorStr != null) {
            personStorage.deleteDoctorById(doctorStr);
        } else {
            System.out.println("doctor ne sushestvuet");
        }
    }

    private static void searchDoctorByProfession() {
        personStorage.printDoctors();
        System.out.println("Please input doctor profession");
        String doctorProfession = scanner.nextLine();
        Doctor doctorByProfession = personStorage.getDoctorByProfession(doctorProfession);
        if (doctorByProfession != null) {
            System.out.println(doctorByProfession);
        } else {
            System.out.println("takoi doktor ne sushestvuet");
        }
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor id,name,surname,phoneNumber,email,profession");
        String doctorStr = scanner.nextLine();
        String[] doctorData = doctorStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorId, doctorData[1], doctorData[2], doctorData[3], doctorData[4], doctorData[5]);
            personStorage.addDoctor(doctor);
            System.out.println("Doctor created");
        } else {
            System.out.println("doctor s takim iminom sushestvuet!");
        }
    }
}
