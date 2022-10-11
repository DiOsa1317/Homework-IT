package com.samsung;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int b;

            if (A < 1 || A > 12) b = 0;
            else if (A == 2) b = 28;
            else if (A == 4 || A == 6 || A == 9 || A == 11) b = 30;
            else b = 31;

        if(A>0 && A<13 && B>0 && B<=b) {
            if (A - 1 == 0)  System.out.println(365 - B);
            if (A - 1 == 1) System.out.println(365 - 31 - B);
            if (A - 1 == 2) System.out.println( -59 + 365 - B);
            if (A - 1 == 3) System.out.println(-90 + 365 - B);
            if (A - 1 == 4) System.out.println(-120 + 365 - B);
            if (A - 1 == 5) System.out.println(-151 + 365 - B);
            if (A - 1 == 6) System.out.println(-181 + 365 - B);
            if (12 - A == 0) System.out.println(b - B);
            if (12 - A == 1) System.out.println(31 + b - B);
            if (12 - A == 2) System.out.println(61 + b - B);
            if (12 - A == 3) System.out.println(92 + b - B);
            if (12 - A == 4) System.out.println(122 + b - B);
        } else System.out.println(-1);
    }
}
