package com.linearsearch;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;
public class squareRoot {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ans=sq(a);
        System.out.println(ans);
    }
    static int sq(int a){
     int b=(int) Math.sqrt(a);
     return  b;
    }
}

