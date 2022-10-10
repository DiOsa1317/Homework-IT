package com.samsung;

import java.util.Scanner;

public class Next7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            String res = (x*x+y*y<1 && x>0) || (y>0 && x<=0 && y>-x && x*x+y*y<1)  || (y<0 && x<=0 && y<x && x*x+y*y<1) ? "YES" : "NO";
            System.out.println(res);
        }
    }

