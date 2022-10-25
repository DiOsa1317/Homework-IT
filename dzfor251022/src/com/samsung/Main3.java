package com.samsung;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ar = new int[N][N];
        int i, j;
        boolean b=true;
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                if((ar[i][j]!=ar[j][i]) && (i!=j)) {
                    b=false;
                    break;
                }
            }
        }
        if(b==true) System.out.println("yes");
        else System.out.println("no");
    }
}
