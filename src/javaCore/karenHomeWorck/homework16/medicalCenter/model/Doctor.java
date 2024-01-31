package javaCore.karenHomeWorck.homework16.medicalCenter.model;

public class Doctor extends Person {

    private String email;
    private Profession profession;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, Profession profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        if (getEmail() != null ? !getEmail().equals(doctor.getEmail()) : doctor.getEmail() != null) return false;
        return getProfession() == doctor.getProfession();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getProfession() != null ? getProfession().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doctor{" + "email='" + email + '\'' + ", profession=" + profession + "} " + super.toString();
    }
}
