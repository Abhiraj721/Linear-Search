package com.linearsearch;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;
public class maxwealth {
    public static void main(String[] args) {
int [][] arr={
        {1,2,1},
        {4,5,40},
        {7,8,23},
};

        System.out.println(max(arr));

        }

static int max(int [] [] arr){
    int ans=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length ; i++) {
        int  sum=0;
        for (int j = 0; j <arr[i].length ; j++) {

            sum=sum+arr[i][j];
        }
//        System.out.println(sum);
        if(sum>ans)
        {
            ans = sum;
        }

    }
    return ans;


    }
}
