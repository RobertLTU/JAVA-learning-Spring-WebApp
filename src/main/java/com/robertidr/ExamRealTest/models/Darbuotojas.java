package com.robertidr.ExamRealTest.models;

import javax.persistence.*;

@Entity
@Table(name="darbuotojai")
public class Darbuotojas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String vardas;
    private String pavarde;
    private int gimimoMetai;
    private String pareigos;
    private String skyrius;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(int gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public String getSkyrius() {
        return skyrius;
    }

    public void setSkyrius(String skyrius) {
        this.skyrius = skyrius;
    }
}
