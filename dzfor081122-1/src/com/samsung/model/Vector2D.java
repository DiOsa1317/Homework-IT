package com.samsung.model;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        vX=1;
        vY=1;
    }

    public Vector2D(double x, double y) {
        this.vX=x;
        this.vY=y;
    }

    public Vector2D(Vector2D vector2D) {
        this.vX=vector2D.vX;
        this.vY=vector2D.vY;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

    public double length() {
        return Math.sqrt(vX*vX+vY*vY);
    }

    public void add(Vector2D v) {
        this.vX=vX+v.vX;
        this.vY=vY+v.vY;
    }

    public void sub(Vector2D v) {
        this.vX=vX-v.vX;
        this.vY=vY-v.vY;
    }
}
