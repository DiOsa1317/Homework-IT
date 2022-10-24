package com.samsung;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N*N) {
            System.out.print(i + " ");
            i = i + N + 1;
        }
    }
}
