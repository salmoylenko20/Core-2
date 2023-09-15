package com.example.core1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HelloApplication  {

    public static void main(String[] args) {




        String str = "I love Java";
        String[] words = str.split(" ");
        String str1="";

//        for (int i = words.length - 1; i >= 0; i--) {
//            str1 += new StringBuilder(words[i]).reverse().toString().toLowerCase().substring(0, 1).toUpperCase() +
//                    new StringBuilder(words[i]).reverse().toString().toLowerCase().substring(1) + " ";
//        }
//        System.out.println(str1.trim());
//        Findrepeter();
//        test1_UsingWhileAndMapEntry();

        System.out.println(test("fdf"));
    }
    static void Findrepeter(){
        String s="mmababctamantlslmag";
        int distinct = 0 ;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j))
                {
                    distinct++;

                }
            }
            System.out.println(s.charAt(i)+"--"+distinct);
            String d=String.valueOf(s.charAt(i)).trim();
            s=s.replaceAll(d,"");
            distinct = 0;

        }


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 4);
        map.put(3, 5);



        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    public static void test1_UsingWhileAndMapEntry(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 4);
        map.put(3, 5);
        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            if (pair.getKey()>2){
                i += pair.getKey() + pair.getValue();
            }

        }
        System.out.println(i);
    }

    public static String test(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {

            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                } else {
                    return test(s.substring(1, s.length() - 1));
                }
            } else {
                return "NO";
            }
        }
    }
}