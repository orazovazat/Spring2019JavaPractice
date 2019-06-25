package day37;

//import java.util.ArrayList;
//import java.util.List;

import java.util.*;

public class ArrayListPractice2 {

public static void main(String[] args) {

  // where do we put the type of items
  // we put it inside <> diamond operator
  ArrayList<String> lst1 = new ArrayList<>();

  // Adding items
  lst1.add("Yasar");
  lst1.add("Kursat");
  lst1.add("Erdem");
  lst1.add("Emine");
  lst1.add("Tugba");
  lst1.add("Mavlida");

  // getting the count of the items inside
  // we use size() method
  int count = lst1.size();
  System.out.println("item count is : " + count);

  /// iterating over each items using loops
  // for (int i = 0; i < lst1.size() ; i++) {
  for (int i = 0; i < count; i++) {
    // System.out.println( "item " + (i+1) + " : " + lst1.get(i) );
    System.out.println(lst1.get(i));
  }
  System.out.println("--------------------");
  /// iterating over items using For each loop
  for (String each : lst1) {
    System.out.println(each);
  }

}

}
