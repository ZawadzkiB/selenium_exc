package eu.sii.selenium.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

  public static void main(String[] args) {

    //array list vs linked list
    List<String> linkedString = new ArrayList<>();

    List<String> stringi = new ArrayList<>();
    stringi.add("a");
    stringi.add("b");
    stringi.add("c");
    stringi.add("d");
    stringi.add("d");
    System.out.println(stringi);
    System.out.println(stringi.get(1));

    stringi.remove(1);

    String[] strinTab = new String[]{"a","b","c"};
    strinTab[1] = null;

    System.out.println(stringi);
    System.out.println(stringi.get(1));

    stringi.add("z");
    stringi.add("y");

    System.out.println(stringi);
    System.out.println(stringi.get(1));


  }

}
