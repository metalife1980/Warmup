package com.ictexpertsgroup.code;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonInString {
    public static String twoStrings2(String s1, String s2) {
        // Write your code here

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static String twoStrings3(String s1, String s2) {
        // Write your code here
        Long totalFound = s1.chars().filter(c -> s2.indexOf(c) != -1).count();

        if (totalFound > 0) {
            return "YES";
        }

        return "NO";
    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here

        HashSet<Character> l1 = s1.chars().mapToObj(c -> new Character((char) c)).collect(Collectors.toCollection(HashSet::new));

        for (char c : s2.toCharArray()) {
            if (l1.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hi", "whorld"));
    }
}
