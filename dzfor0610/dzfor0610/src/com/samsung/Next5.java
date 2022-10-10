package com.samsung;

import java.util.Scanner;

public class Next5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean aBool= (a%2==0 && b%2==0) || (c%2==0 && b%2==0) || (a%2==0 && c%2==0);
        System.out.println(aBool);
    }
}
