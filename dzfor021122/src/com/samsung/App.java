package com.samsung;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        if(x>=-128 && x<=127) System.out.println("YES");
        else System.out.println("NO");
        if(x>=-32768 && x<=32767) System.out.println("YES");
        else System.out.println("NO");
    }
}

