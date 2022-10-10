package com.samsung;

import java.util.Scanner;

public class Next8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (x<1 && y>1-x && y>2*x*x) || (x>=0.5 && x<1 && y>1-x) ? "YES" : "NO";
        System.out.println(res);
    }
}

