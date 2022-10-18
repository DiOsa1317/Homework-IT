package com.samsung;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int[] br = new int[N];
        int i, j = 0;
        for (i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] < 0) {
                br[j] = ar[i];
                j++;
            }
        }
        for (i = 0; i < N; i++) {
            if (ar[i] > 0) {
                br[j] = ar[i];
                j++;
            }
        }
        for (i = 0; i < N; i++) {
            System.out.print(br[i] + " ");
        }
    }
}
