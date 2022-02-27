package com.linearsearch;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;

public class searchinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String name = scan.next();
        System.out.println("Enter char to search:");
        char target = scan.next().charAt(0);
        System.out.println(target);
        System.out.println("enter you range:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(range(name, target, a, b));


    }


    static int range(String name, char target, int a, int b) {
        for (int i = a; i < b; i++) {
            if (name.charAt(i) == target) {
                return i;

            }

        }
        return 4;

        }
    }