package com.samsung;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N + 1];
        int i, k=0;
        double s = 0;
        boolean m=false;
        for (i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] % 2 != 0) {
                s = s + ar[i];
                m=true;
                k++;
            }
        }
        s=s/k;
        if(m==true) System.out.printf("%.2f", s);
        else System.out.println("NO");
    }
}
