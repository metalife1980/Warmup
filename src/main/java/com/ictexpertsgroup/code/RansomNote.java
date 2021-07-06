package com.ictexpertsgroup.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class RansomNote {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
//        Integer filterSize = magazine.stream().filter(m -> note.contains(m)).collect(toList()).size();
//        if (filterSize == note.size()) {
        Integer wordCount=0;
        for (String w : note) {
            if (magazine.contains(w)) {
                magazine.remove(w);
                wordCount++;
            }else   {
                break;
            }
        }
        if (wordCount.equals(note.size())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String m = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg";
        String n = "elo lxkvg bg mwz clm w ll";

        List<String> magzine = Stream.of(m.split(" ")).collect(toList());
        List<String> ransomNote = Stream.of(n.split(" ")).collect(toList());

        checkMagazine(magzine, ransomNote);
    }
}
