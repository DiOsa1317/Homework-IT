package com.samsung;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1 || N>12) System.out.println(0);
        else if(N==2) System.out.println(28);
        else if(N==4 || N==6 || N==9 || N==11) System.out.println(30);
        else System.out.println(31);


    }
}
