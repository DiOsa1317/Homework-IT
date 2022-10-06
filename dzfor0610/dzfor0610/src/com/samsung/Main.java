package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (x * x + y * y > 4.0 && x < 2.0 && x > y && y > 0.0) ? "YES" : "NO";
        System.out.println(res);
    }
}
