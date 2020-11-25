package com.learning.collection;
//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
    public static void main(String[]args){
       Set<String> names = new TreeSet<>();
       names.add("Himanshu");
       names.add("Karan");
       names.add("Kaustav");
       names.add("Mansi");
       names.add("Mansi");
       names.add("Ruchit");
       //Enhanced for loop
     //  for(String name: names){
          //  System.err.println(names);
     //   }
       Iterator<String> it = names.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
    
}
