package com.example.atomic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {
        System.out.println(twoSum("fgfg + hgh"));
        System.out.println("Heloo");
    }
    public static String twoSum(String str) {

        String[] words = str.split("\\+");

        return words[1];

    }

}
