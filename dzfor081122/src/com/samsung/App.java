package com.samsung;

import com.samsung.model.Fraction;

public class App {
    public static void main(String[] args) {
        Fraction franction = new Fraction(5, 10);
        Fraction franction1 = new Fraction(7, 21);
        franction.normalization();
        franction1.normalization();
        System.out.println(franction.sumFraction(franction1, franction));
        System.out.println(franction.difFraction(franction, franction1));
        System.out.println(franction.multiFraction(franction, franction1));
        System.out.println(franction.divFraction(franction, franction1));
    }
}
