package com.samsung;

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
            else System.out.println("x<" + B/A + " or x>"+ (-1)*(B/A));
        }
        if(A<0) {
            if(B<0) System.out.println("no such x");
            else System.out.println(B/A + "<x<" + (-1)*(B/A));
        }

    }
    
}
