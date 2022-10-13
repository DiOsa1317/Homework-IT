package com.samsung;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        if(n>10) s=s+n;
        while(n%5!=0) {
            n=sc.nextInt();
            if(n>10) s=s+n;
        }
        System.out.println(s);
    }
}
