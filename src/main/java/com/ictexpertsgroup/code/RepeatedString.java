package com.ictexpertsgroup.code;

public class RepeatedString {

    public RepeatedString() {
    }

    //    this function repeat the string s until its length is equal to n
    public long repeatedString(String s, long n){

        char [] charArr = s.toCharArray();
        long noOfOccuranceOfa=0;
        for (char c:charArr
             ) {
            if (c=='a')
                noOfOccuranceOfa++;
        }
        noOfOccuranceOfa = noOfOccuranceOfa * ((long)n / s.length());
        long remainder = n % s.length();
        if (remainder>0){
            for (int i = 0; i<remainder;i++){
                if(charArr[i]=='a'){
                    noOfOccuranceOfa++;
                }
            }
        }

        return noOfOccuranceOfa;
    }

    public boolean validateInput(String s) {
        for (char c: s.toCharArray()
             ) {
            if (c!='a' && c!='b'){
                return false;
            }
        }
        return true;
    }
}
