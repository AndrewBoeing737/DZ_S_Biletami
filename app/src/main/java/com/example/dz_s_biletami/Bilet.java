package com.example.dz_s_biletami;

import java.io.Serializable;

public class Bilet implements Serializable {
    String name;
    String surname;
    String from;

    public Bilet(String name, String surname, String from, String to) {
        this.name = name;
        this.surname = surname;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    String to;
}
