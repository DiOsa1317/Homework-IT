package com.samsung;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i, k=0;
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            if(ar[i]>0) k++;
        }
        System.out.println(k);
    }
}
