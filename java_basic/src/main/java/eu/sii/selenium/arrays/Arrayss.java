package eu.sii.selenium.arrays;

import java.util.Comparator;
import java.util.stream.Stream;

public class Arrayss {

  public static void main(String[] args) {

    String[] strings = new String[5];
    strings[0] = "a";
    strings[1] = "b";
    strings[2] = "c";
    strings[3] = "d";
    strings[4] = "e";
    //             0   1   2   3   4
    // strings = ['a','b','c','d','e']

//    System.out.println("Moje stringi: " + strings[1]); // ??

//    System.out.println(strings[0]);

//    for(String str : strings) {
//      System.out.println(str);
//    }

    Stream.of(strings).forEach(System.out::print);

    Integer[] inty = new Integer[]{1,2,3,4,5,6,7};
    for(int i: inty) {
      System.out.println(i);
    }

    Stream.of(inty).forEach(it -> System.out.println(it*10));

    String[][] splontaneStringi = new String[][]{{"a","b"},{"c","d","z","y"},{"e","f"}};
    System.out.println(splontaneStringi[1][2]);

  }
}
