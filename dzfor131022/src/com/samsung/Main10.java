package com.samsung;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = N + 1;
        int i = 2;
        while (N < 1000000) {
            if (N % i == 0) {
                N++;
                i = 2;
            } else i++;
            if(i>=N) break;
        }
        System.out.println(N);
    }
}
