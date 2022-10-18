package com.samsung;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, k=1;
        int R=N;
        while(R/2>0) {
            k++;
            R=R/2;
        }
        int[] ar = new int[k];
        for (i = 0; i < k; i++) {
            ar[i] = N % 2;
            N = N / 2;
        }
        for (i = 0; i <k; i++) {
            System.out.print(ar[i]);
        }
    }
}

