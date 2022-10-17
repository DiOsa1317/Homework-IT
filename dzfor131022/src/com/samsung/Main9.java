package com.samsung;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int m=9;
        int p;
        while(N>0) {
            p=N%10;
            if(m>p && p!=0) {
                m=p;
                }
            N=N/10;
        }
        System.out.println(m);
    }
}
