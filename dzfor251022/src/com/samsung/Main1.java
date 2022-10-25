package com.samsung;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] ar=new int[N][M];
        int[][] ar1=new int[M][N];
        int i, j;
        for(i=0; i<N; i++) {
            for(j=0; j<M; j++) {
                ar[i][j]=sc.nextInt();
                ar1[j][N-i-1]=ar[i][j];
            }
        }
        System.out.println(M+" "+N);
        for(i=0; i<M; i++) {
            for(j=0; j<N; j++) {
                System.out.print(ar1[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
