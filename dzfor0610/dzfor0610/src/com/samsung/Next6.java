package com.samsung;

import java.util.Scanner;

public class Next6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (y>x*x-2 && y<0) || (y>0 && y<-x && y>x*x-2) || (y>0 && y<x && y>x*x-2) ? "YES" : "NO";
        System.out.println(res);
    }
}
