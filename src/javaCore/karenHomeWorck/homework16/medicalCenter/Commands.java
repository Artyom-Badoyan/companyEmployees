package javaCore.karenHomeWorck.homework16.medicalCenter;

public interface Commands {

    /*Ունենալու ենք հետևյալ հրամանները
0 - exit
1 - add doctor
2 - search doctor by profession
3 - delete doctor by id
4 -  change doctor data by id(բացի իդ-ից ամեն ինչ կարողանալու ենք փոխել)
5 - add patient(ընտրելու եք բժշկին, բայց ստուգեք որ էդ ժամը զբաղված չլինի)
6 - print all  patients by doctor
7 - print todays patients
Ամսաթվերի հետ աշխատանքը կարող եք անել Date-կլասսի մեթոդներով։ Հարցերի դեպքում գրեք չաթի մեջ։
Հրամանները պտի պահեք Interface-ով։
Բոլոր հնարավորությունները առանձին սիրուն մեթոդներով արեք, DateUtil-ը նույնպես ինչպես անցել ենք։*/

    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TO_DAYS_PATIENTS = "7";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_DOCTOR + " add doctor");
        System.out.println("please input " + SEARCH_DOCTOR_BY_PROFESSION + " doctor id");
        System.out.println("please input " + DELETE_DOCTOR_BY_ID + " doctor id");
        System.out.println("please input " + CHANGE_DOCTOR_DATA_BY_ID + " doctor id");
        System.out.println("please input " + ADD_PATIENT + " add patient");
        System.out.println("please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " doctor id");
        System.out.println("please input " + PRINT_TO_DAYS_PATIENTS + " print to days patients");
    }
}
