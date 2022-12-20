package com.samsung.model;

public class Situation {
    public String subject;
    public String text;
    public int dB;
    public int dR;
    public int dH;
    public Situation[] direction;

    public Situation(String subject, String text, int variants, int db, int dr, int dh) {
        this.subject = subject;
        this.text = text;
        dB = db;
        dR = dr;
        dH = dh;
        direction=new Situation[variants];
    }

    public Situation(Situation situation) {
        this.subject=situation.subject;
        this.text= situation.text;
        this.dB=situation.dB;
        this.dR=situation.dR;
        this.dH=situation.dH;
        this.direction=situation.direction;
    }
}
