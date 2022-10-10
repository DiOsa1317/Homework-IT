package com.samsung;

import java.util.Scanner;

public class Next4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            boolean aBool=x>0 && x/100>0 && x/100<10 && x%5==0;
            System.out.println(aBool);
        }
    }
