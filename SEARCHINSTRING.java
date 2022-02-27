package com.linearsearch;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;
public class SEARCHINSTRING {
    public static void main(String[] args) {
        String name = "abhiraj";
        char [] arr=name.toCharArray();
        System.out.println(Arrays.toString(arr));
        char target = 'z';
        boolean ans= stringsearch(name, target);
        System.out.println(ans);
        System.out.println( searchwithforeachloop(name, target,arr));

    }
    //for each loop
    static boolean searchwithforeachloop(String name,char target,char []arr) {
        for (char a : arr) {
            System.out.println(a);
        }
return true;
    }
    static boolean stringsearch(String name,char target){
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)==target){
                return true;

            }


        }
        return false;

    }
}








