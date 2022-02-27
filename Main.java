package com.linearsearch;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int[] arr = {12, 32, 23, 23, 12, 3, 11, 2};
        int target = 2323233;
        int ans = linear(arr, target);
        System.out.print(ans);
    }

    static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }


        }
        return Integer.MAX_VALUE;
    }

}





