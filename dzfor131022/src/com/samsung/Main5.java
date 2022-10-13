package com.samsung;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        while(n/2>0) {
            k++;
            n=n/2;
        }
        System.out.println(k);
    }
}
