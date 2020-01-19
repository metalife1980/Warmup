package  com.ictexpertsgroup.code;

import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s){
        int valleys=0;
        char stepDirection;
        char [] stepArr = s.toCharArray();
        int seaLevel=0;
        boolean climbingValley=false;

        for (int i=0; i< stepArr.length; i++){
            if (stepArr[i] == 'U'){
                seaLevel++;
            }else if (stepArr[i] == 'D'){
                seaLevel--;
            }
            if (seaLevel<0 && climbingValley==false) {
                valleys++;
                climbingValley=true;
            }
            if(seaLevel==0){
                climbingValley=false;
            }
        }

        return valleys;
    }

    private static final Scanner scanner= new Scanner(System.in);
    public static void main (String [] args){
        int n= scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u0085])?");
        String s=scanner.nextLine();
        int result = countingValleys(n,s);
        System.out.println(result);
        scanner.close();
    }
}
