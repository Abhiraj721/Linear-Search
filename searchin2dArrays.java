package com.linearsearch;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;
public class searchin2dArrays {
    public static void main(String[] args) {


        int[][] arr = new int[3][3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scan.nextInt();



            }


        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }

        }
        System.out.println();
        int ans=  min(arr);
        System.out.println(ans);

    }
    static  int min(int [][] arr){
        int temp=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]<temp) {
                    temp = arr[i][j];
                }

            }

        }
        return temp;

    }
}
