package com.samsung;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (y<2-x*x && ((x<=0 && y>x) || (x>=0 && y>0))) ? "YES" : "NO";
        System.out.println(res);
    }
}
