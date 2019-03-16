package eu.sii.selenium.arrays;

import java.util.stream.Stream;

public class ArraysExcercises {

  /**
   * 1. Przygotuj tablicę dowolnych 5 liczb z zakresu 0-100 a następnie przeszukają ją i wypisz największą liczbę
   * 2. Xaxaxaxaxa, Cxcyxayxcaxacsaxcxs, xdxdxdxdxdxdxdxdssdxcxxcxdddsdsx, xlxlxlxlxlxlxllxlxlxlx Napisz metodę która przyjmie
   * tablice jako parametr i sprawdzi w którym z ciągów znaków najwięcej razy występuje 'x'.
   */
  static Integer[] inty = new Integer[]{1,2,6,5,2};
  static String[] stringi = new String[]{"Xaxaxaxaxa",
          "Cxcyxayxcaxacsaxcxs", "xdxdxdxdxdxdxdxdssdxcxxcxdddsdsx", "xlxlxlxlxlxlxllxlxlxlx"};

  public static void main(String[] args) {
    findMax();
    int max = Stream.of(inty).max(Integer::compareTo).orElse(0);
    System.out.println(max);
    findX();
  }

  static void findX(){
    int max = 0;
    int i = 0;
    int index = 0;
    for(String text: stringi) {
      char[] chars = text.toCharArray();
      int numbersOfX = 0;
      for(char c: chars){
        if(c == 'x'){
          numbersOfX++;
        }
      }
      if(numbersOfX>max){
        max=numbersOfX;
        index = i;
      }
      i++;
    }
    System.out.println(stringi[index]);
  }

  static void findMax() {
    int max = inty[0];
    for(int i: inty){
      if(i>max){
        max = i;
      }
    }
    System.out.println(max);
  }




}
