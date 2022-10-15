package com.samsung;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean a=false;
        while(N>0){
            if(N%10==N/10%10) {
                System.out.println("YES");
                a=true;
                break;
            } else N=N/10;
        }
        if(a==false) System.out.println("NO");
    }
}
