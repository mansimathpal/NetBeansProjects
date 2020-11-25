package com.learning.collection;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 200);
        fruits.put("Banana", 50);
        fruits.put("Mango", 20);
        fruits.put("Guava", 30);
        fruits.put("Apple", 500);
        fruits.put("Mango", 250);
        fruits.put("Plum", 150);
         
        for(Map.Entry<String, Integer>entry : fruits.entrySet())
        {
           // System.out.println(fruits);
           // System.out.println("key :"+ entry.getValue());
              System.out.println(entry.getKey()+"-->" +entry.getValue());
        }
    }
    
}
