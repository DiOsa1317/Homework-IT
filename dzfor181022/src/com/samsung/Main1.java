package com.samsung;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar=new int[N+1];
        boolean b=false;
        for(int i=1; i<=N; i++) {
            ar[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        for(int i=1; i<=N; i++) {
            if(ar[i]==X) {
                b=true;
                System.out.println(i);
                break;
            }
        }
        if(b==false) System.out.println("NO");
    }
}
