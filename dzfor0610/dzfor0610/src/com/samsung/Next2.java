package com.samsung;

import java.util.Scanner;

public class Next2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        boolean aBool=(x>=-3 && x<=5) || (x>=9 && x<=15) ;
        System.out.println(aBool);
    }
}
