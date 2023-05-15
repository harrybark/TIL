package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.usage;

import java.util.*;

public class AdaptorInJava {

    public static void main(String[] args) {
        // collection
        List<String> stringList = Arrays.asList("A", "B", "C", "D");
        Enumeration<String> enumeration = Collections.enumeration(stringList);
        ArrayList<String> list = Collections.list(enumeration);

        // io

    }
}
