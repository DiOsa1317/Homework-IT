package com.samsung;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        long n = sc.nextLong();
        double pow=1;
        while (n > 0) {
            if(n%2==0) {
                a=a*a;
                n=n/2;
            } else {
                pow=pow*a;
                n--;
            }
        }
        System.out.println(pow);
    }
}
