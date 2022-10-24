package com.samsung;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i, k=0;
        ar[0] = sc.nextInt();
        for (i = 1; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            if(ar[i]>ar[i-1]) k++;
        }
        System.out.println(k);
    }
}
