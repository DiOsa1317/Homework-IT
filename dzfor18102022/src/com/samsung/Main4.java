package com.samsung;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i;
        ar[0] = 4;
        System.out.print(ar[0] + " ");
        for(i=1; i<N; i++) {
            ar[i]=ar[i-1]+3;
            System.out.print(ar[i] + " ");
        }
    }
}
