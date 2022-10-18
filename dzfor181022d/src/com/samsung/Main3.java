package com.samsung;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, k=1;
        int[][] ar = new int[N][N];
        for(i=0; i<N; i++) {
            for(int j=0;j<N; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
}
