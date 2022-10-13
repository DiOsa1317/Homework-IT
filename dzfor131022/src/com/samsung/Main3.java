package com.samsung;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0, a, b, n;
        n=sc.nextInt();
        while(n>=10 && n<=99) {
            a=n%10;
            b=n/10;
            s=s+a+b;
            n=sc.nextInt();
        }
        System.out.println(s);
    }
}


