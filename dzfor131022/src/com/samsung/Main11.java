package com.samsung;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n, k=0;
        boolean a=true;
        while(N>0) {
            k++;
            n=sc.nextInt();
            if(n<=437) {
                a=false;
                break;
            }
            N--;
        }
        if(a==true) System.out.println("No crash");
        else System.out.println("Crash " + k);
    }
}
