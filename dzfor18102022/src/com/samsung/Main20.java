package com.samsung;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i, max;
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        max = ar[0];
        for (i = 1; i < ar.length; i++) {
            if (ar[i] > max) max = ar[i];
        }
        System.out.println(max);
    }
}
