package com.telacad.spring_curs8_ex2.model;

public class Carte {

    private int id;
    private String denumire;

    private int pret;

    public Carte() {
    }

    public Carte(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
