package com.samsung;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, d;
        int N=sc.nextInt();
        d=N%10;
        b=N/10%10;
        a=N/100;
        if(a!=0) System.out.print("C");
        if(b==9) System.out.print("XC");
        if(b==8) System.out.print("LXXX");
        if(b==7) System.out.print("LXX");
        if(b==6) System.out.print("LX");
        if(b==5) System.out.print("L");
        if(b==4) System.out.print("XL");
        if(b==3) System.out.print("XXX");
        if(b==2) System.out.print("XX");
        if(b==1) System.out.print("X");
        if(d==9) System.out.println("IX");
        if(d==8) System.out.print("VIII");
        if(d==7) System.out.print("VII");
        if(d==6) System.out.print("VI");
        if(d==5) System.out.print("V");
        if(d==4) System.out.print("IV");
        if(d==3) System.out.print("III");
        if(d==2) System.out.print("II");
        if(d==1) System.out.print("I");

}
}
