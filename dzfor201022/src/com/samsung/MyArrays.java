package com.samsung;

import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i;
        int[] ar = new int[N];
        for (i= 0; i < ar.length ; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.printf("%.2f",avgOf4Digit(ar));
    }
    public static double avgOf4Digit(int[]ar) {
    double k=0, sum=0;
    int i;
    boolean a=false;
        for (i= 0; i < ar.length ; i++) {
            if(ar[i]>999 && ar[i]<10000) {
                sum=sum + ar[i];
                k++;
                a=true;
            }
        }
        if(a==true) {
            double res=sum/k;
            return res;
        }
        else return -1;
    }
}
