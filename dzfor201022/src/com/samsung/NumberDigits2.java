package com.samsung;

import java.util.Scanner;

public class NumberDigits2 {
    public static int sumOfThirteen(int N) {
        int s=0, k=1, t;
        for(int i=49; i<N; i++) {
            t=i;
            while (t > 0) {
                s = s + t % 10;
                t = t / 10;
            }
            if (s % 13 == 0) k++;
            s=0;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(sumOfThirteen(N));
    }
}
