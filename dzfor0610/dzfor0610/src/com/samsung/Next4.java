package com.samsung;

import java.util.Scanner;

public class Next4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            boolean aBool=x>0 && x%100!=0 && x%5==0;
            System.out.println(aBool);
        }
    }
