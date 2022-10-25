package com.samsung;

import java.util.Scanner;

public class Geom {
    public static double segmentLength(int x0, int y0, int x1, int y1) {
        double l=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
        return l;
    }
    public static double trianglePerimetr(int x0, int y0, int x1, int y1, int x2, int y2) {
        double P=segmentLength(x0, y0, x1, y1) + segmentLength(x0, y0, x2, y2) + segmentLength(x1, y1, x2, y2);
        return P;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(trianglePerimetr(x0, y0, x1, y1, x2, y2));
    }
}
