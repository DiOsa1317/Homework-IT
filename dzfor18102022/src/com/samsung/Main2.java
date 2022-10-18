package com.samsung;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N + 1];
        int i, s = 0;
        boolean m=false;
        for (i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] % 2 == 0) {
                s = s + ar[i];
                m=true;
            }
        }
        if(m==true) System.out.println(s);
        else System.out.println("NO");
    }
}
