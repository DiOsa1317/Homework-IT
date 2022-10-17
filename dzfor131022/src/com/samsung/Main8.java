package com.samsung;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean a=false;
        int r=0, p;
        while(N>0) {
            p=N%10;
            if(p%2!=0) {
                r=p;
                a=true;
                break;
            }
            N=N/10;
        }
        if(a==true) System.out.println(r);
        else System.out.println("NO");
    }
}
