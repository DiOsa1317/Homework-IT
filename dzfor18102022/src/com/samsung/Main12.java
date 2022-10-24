package com.samsung;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, f = 1;
        for (i = 2; i <= N; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
