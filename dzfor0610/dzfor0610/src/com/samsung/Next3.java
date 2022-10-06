package com.samsung;

import java.util.Scanner;

public class Next3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        boolean aBool=x<-2 || (x>3 && x<6) || x>9;
        System.out.println(aBool);
    }
}
