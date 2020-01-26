package com.ictexpertsgroup.code;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;


public class HourGlassProblem {

    static int hourglassSum(int [][] arr){
        int hourglassSumResult=0;
        int tempSum=0;
        boolean hourglassSumResultInitialized=false;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                for (int fi=i; fi<i+3; fi++){
                    for (int fj=j; fj< j+3; fj++){
                        if (fi == i+1){
                            tempSum = tempSum + arr[fi][fj+1];
                            break;
                        }else{
                            tempSum = tempSum + arr[fi][fj];
                        }
                    }
                }
                if (!hourglassSumResultInitialized || hourglassSumResult < tempSum){
                    hourglassSumResult=tempSum;
                    hourglassSumResultInitialized=true;
                }
                tempSum=0;
            }
        }
        return hourglassSumResult;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) throws IOException{
        int [][] arr = new int [6][6];

        for (int i=0; i<6; i++){
            String [] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j=0; j < 6; j++){
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println("result : " + result);
    }
}
