package com.samsung;

import java.util.Scanner;

public class Next10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (x>0 && y<1 && y>0 && x<1) || (x*x+y*y<1) ? "YES" : "NO";
        System.out.println(res);
    }
}
