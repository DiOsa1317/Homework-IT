package com.samsung;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=0;
        int n=26;
        while(n<N) {
            s=s+n;
            n=n+2;
        }
        System.out.println(s);
    }
}
