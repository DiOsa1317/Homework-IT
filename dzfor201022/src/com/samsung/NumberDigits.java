package com.samsung;

import java.util.Scanner;

public class NumberDigits {
    public static int sumOfDigits(int N) {
        int s=0;
        while(N>0) {
            s=s+N%10;
            N=N/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(sumOfDigits(N));
    }
}
