package com.samsung;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int i;
        int k=0,r=0;
        for (i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        int ch=ar[0];
        for (i = 0; i < N; i++) {
            for(int j=i+1; j<N; j++) {
                if(ar[i]==ar[j]) k++;
            }
            if(k>r) {
                r=k;
                k=0;
                ch=ar[i];
            }
        }
        System.out.println(ch);
        }
}
