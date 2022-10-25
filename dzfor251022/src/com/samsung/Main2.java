package com.samsung;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ar = new int[N][N];
        int i, j;
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                if (i + j < N-1) ar[i][j] = 0;
                if (i + j == N-1) ar[i][j] = 1;
                if (i + j > N-1) ar[i][j] = 2;
            }
        }
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
