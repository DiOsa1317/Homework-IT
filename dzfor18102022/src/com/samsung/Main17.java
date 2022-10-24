package com.samsung;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i;
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (i = 0; i < ar.length; i++) {
            if(ar[i]%2==0) System.out.print(ar[i] + " ");
        }
    }
}
