package com.samsung;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K=N;
        N=N%100;
        if(N<=10 || N>=15) {
            if (N % 10 == 0 || N % 10 >= 5) System.out.println(K + " TORTOV");
            if (N % 10 == 1) System.out.println(K + " TORT");
            if(N%10>=2 && N%10<=4)  System.out.println(K + " TORTA");
        } else System.out.println(K + " TORTOV");

    }
}
