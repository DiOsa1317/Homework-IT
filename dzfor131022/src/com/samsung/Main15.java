package com.samsung;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=0;
        while(N>0){
            s=s+N%10;
            N=N/10;
        }
        System.out.println(s);
    }
}
