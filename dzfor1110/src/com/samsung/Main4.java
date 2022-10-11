package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        if(A==0) {
            if(B>0) System.out.println("any x");
            else System.out.println("no such x");
        }
        if(A>0) {
            if(B>0)  System.out.println("any x");
            else System.out.println("x<" + String.format(Locale.US, "%.1f",B/A) + " or x>"+ String.format(Locale.US, "%.1f",(-1)*(B/A)));
        }
        if(A<0) {
            if(B<0) System.out.println("no such x");
            else System.out.println(String.format(Locale.US, "%.1f",B/A)+ "<x<" + String.format(Locale.US, "%.1f",(-1)*(B/A)));
        }

    }
    
}
