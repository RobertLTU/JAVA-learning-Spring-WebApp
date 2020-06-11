package com.robertidr.ExamRealTest.models;

public class Skyrius {
    private String pavadinimas;
    private int darbuotojuSkaicius;

    public Skyrius() {
    }

    public Skyrius(String pavadinimas, int darbuotojuSkaicius) {
        this.pavadinimas = pavadinimas;
        this.darbuotojuSkaicius = darbuotojuSkaicius;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getDarbuotojuSkaicius() {
        return darbuotojuSkaicius;
    }

    public void setDarbuotojuSkaicius(int darbuotojuSkaicius) {
        this.darbuotojuSkaicius = darbuotojuSkaicius;
    }
}
