package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String res = (y<Math.sin(x) && y<0.5 && y>0 && x>0 && x<Math.PI) ? "YES" : "NO";
        System.out.println(res);
    }
}
