package com.samsung;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int a, b, p=0;
        boolean r=true;
        boolean m=true;
        if(A<0) {
            A=A-A-A;
            r=false;
        }
        if(B<0) {
            B=B-B-B;
            m=false;
        }
        if(A>B) {
            a=A;
            b=B;
        } else {
            b=A;
            a=B;
        }
        while(b>0) {
            p=p+a;
            b--;
        }
        if((r==true && m==true) || (r==false && m==false)) System.out.println(p);
        else System.out.println(p-p-p);
        }
}
