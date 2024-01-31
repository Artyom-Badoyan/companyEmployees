package javaCore.karenHomeWorck.homeWork17.enumExample;

public enum Language {

    HY("Armenia"),
    RU("Russia"),
    ENG("United States"),
    FR;

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {
    }

    public String getCountry() {
        return country;
    }
}
