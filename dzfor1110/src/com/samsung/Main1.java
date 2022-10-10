package com.samsung;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0 && a<10) System.out.println("DIGIT");
        else if(a>9 && a<100) System.out.println("NUM");
        else System.out.println("OTHER");

    }
}
