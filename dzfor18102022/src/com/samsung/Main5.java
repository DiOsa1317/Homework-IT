package com.samsung;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i;
        int r;
        for (i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        for (i = 0; i < N / 2; i++) {
            r = ar[i];
            ar[i] = ar[N - i - 1];
            ar[N - i - 1] = r;
        }
        for (i = 0; i < N; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
