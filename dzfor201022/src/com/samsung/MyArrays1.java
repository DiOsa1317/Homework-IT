package com.samsung;

import java.util.Scanner;

public class MyArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        double [] ar = new double[10000];
        for(i=0; i<ar.length; i++) {
            ar[i] = 0.5;
        }
        i=0;
        while (sc.hasNext()) {
            ar[i] = sc.nextDouble();
            i++;
        }
        minToBegin(ar);
    }

        public static void minToBegin(double[]ar) {
            double min=ar[0];
            int i=0, k=0, m=0;
            while(ar[i]!=0.5) {
                m++;
                i++;
            }
            for (i= 1; i < m ; i++) {
                if (ar[i] < min) {
                    k = i;
                    min = ar[i];
                }
            }
            for (i= k; i > 0 ; i--) {
                    ar[i]=ar[i-1];
            }
            ar[0]=min;
            for (i= 0; i < m ; i++) {
                System.out.printf("%.0f", ar[i]);
                System.out.print(" ");
            }
    }
}
