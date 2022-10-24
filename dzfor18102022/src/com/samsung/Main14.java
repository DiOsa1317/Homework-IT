package com.samsung;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N-1];
        int i, s=0;
        for(i=0; i<ar.length; i++) {
            ar[i] = sc.nextInt();
            s=s+ar[i];
        }
        System.out.println((N+1)*N/2 - s);
        }
    }
