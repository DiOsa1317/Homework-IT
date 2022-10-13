package com.samsung;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int k=0;
        while(A-B>=0) {
           k++;
           A=A-B;
        }
        System.out.println(k + " " + A);
    }
}
