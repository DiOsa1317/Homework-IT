package com.samsung;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int x=10000;
        boolean z=false;
        while(x<100000) {
            if (x % a == b && x % c == d) {
                System.out.print(x + " ");
                z=true;
            }
            x++;
        }
        if(z==false) System.out.println(-1);
    }

}
