package com.ictexpertsgroup.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumBribes {

    public static void minimumBribes(List <Integer> q){
        Integer totalBribes = 0;
        for (int i = 0; i < q.size(); i++) {

            if (q.get(i) - (i+1) > 2)
            {
                System.out.println("Too chaotic");
                    return;
            }

            if (q.get(i) > (i+1)){
                totalBribes = totalBribes + q.get(i) - (i+1);
            }
        }
        System.out.println(totalBribes);

//        int swaps=0;
//        for(int i=0;i< q.size();i++){
//            for(int j=i+1;j<q.size();j++){
//                if(q.get(i) > q.get(j)){
//                    int tmp=q.get(j);
//                    q.set(j,q.get(i));
//                    q.set(i, tmp);
//                    swaps++;
//                }
//            }
//        }
//        System.out.println(swaps);

    }

    public static void main (String [] args ){
       // List q = new ArrayList<Integer> ();
        String input ="1 2 5 3 7 8 6 4";
        List q = Stream.of (input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        minimumBribes(q);
    }
}
