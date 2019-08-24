package com.xxy.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();

        //map
        HashMap<String,String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        System.out.println(stocks.get("2330"));
        stocks.get("2330");
        for(String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        System.out.println(set);
        for(int n:set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = (int)list.get(0);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68, 77, 88 ,99, 100);
        for(int score:scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        int[] scores = {5, 6, 7, 8, 9};
        for(int i=0; i<5; i++){
            System.out.println(scores[i]);
        }
        for(int n:scores){
            System.out.println(n);
        }
    }
}
