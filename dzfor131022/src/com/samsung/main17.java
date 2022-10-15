package com.samsung;

import java.util.Scanner;

public class main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long  i=2L;
        boolean a=true;
        while(i<=N/2) {
            if(N%i==0) {
                a=false;
                break;
            } else i++;
        }
        if(a==true) System.out.println("prime");
        else System.out.println("composite");
    }
}
