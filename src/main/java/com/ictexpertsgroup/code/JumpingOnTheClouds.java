package com.ictexpertsgroup.code;


import java.util.Arrays;
import java.util.Scanner;


public class JumpingOnTheClouds {
    private static final Scanner scanner = new Scanner(System.in);

    public JumpingOnTheClouds() {

    }

    boolean validateGameInput(int [] c){
        for (int i:c
             ) {
            if (i!=0 && i!=1){
                return false;
            }
        }

       return true;
    }

    static int jumpingOnTheClouds(int [] c){

        int noOfJumps=0;
        for (int i=0; i<c.length;){
            if ( i+2< c.length && c[i+2] == 0 ){
                i+=2;
                noOfJumps++;
            }else if ( i+1< c.length && c[i+1] == 0 ){
                i+=1;
                noOfJumps++;
            }else{
                break;
            }
        }
        return noOfJumps;
    }



    public static void main(String [] args){
        int n=scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int [] c = new int [n];
        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i =0; i<n; i++){
            c[i] = Integer.parseInt(cItems[i]);
        }

        int result = jumpingOnTheClouds(c);
        System.out.println("result: " + result);
    }
}
