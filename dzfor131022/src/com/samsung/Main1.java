package com.samsung;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        while(n>=0) {
            n=sc.nextInt();
            k++;
        }
        System.out.println(k);
    }
}
