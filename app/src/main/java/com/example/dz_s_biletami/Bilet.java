package com.example.dz_s_biletami;

import java.io.Serializable;

public class Bilet implements Serializable {
    String id;
    String stoimost;
    String mesto;
    String vremya_otpravlenia;
    String vremua_prybytia;

    public Bilet(String id, String vremua, String mesto, String vremya_otpravlenia, String vremua_prybytia) {
        this.id = id;
        this.stoimost = vremua;
        this.mesto = mesto;
        this.vremya_otpravlenia = vremya_otpravlenia;
        this.vremua_prybytia = vremua_prybytia;
    }

}
