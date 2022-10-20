package com.samsung;

import java.util.Scanner;

public class NumberDigits1 {
    public static int sumOfSeven(int a, int b) {
        int s=0;
        for(int i=a; i<=b; i++){
            if(i%7==0) s=s+i%10+i/10;
            }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<14) a=14;
        if(b>98) b=98;
        if(a>98 || b<14) System.out.println(0);
        else System.out.println(sumOfSeven(a, b));
    }
}
