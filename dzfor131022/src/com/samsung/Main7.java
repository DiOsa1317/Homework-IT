package com.samsung;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=0;
        while(N>0) {
            k++;
            N=N/10;
        }
        System.out.println(k);
    }
}
