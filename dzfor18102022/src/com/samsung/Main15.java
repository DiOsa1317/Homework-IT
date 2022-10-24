package com.samsung;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] ar = new int[N+1];
        int i, a=0, b;
        for(i=1; i<ar.length; i++) {
            ar[i] = i;
        }
        for(i=A; i<=A+(B-A)/2; i++) {
            b=ar[i];
            ar[i]=ar[B-a];
            ar[B-a]=b;
            a++;
        }
        a=0;
        for(i=C; i<=C+(D-C)/2; i++) {
            b=ar[i];
            ar[i]=ar[D-a];
            ar[D-a]=b;
            a++;
        }
        for(i=1; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        }
}
