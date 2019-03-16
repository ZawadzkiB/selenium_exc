package eu.sii.selenium.loops;

public class LoopExcercise {

  /**
   * 1. Wypisz liczby podzielne przez 3 i przez 5 z zakresu od 0 - 1000, użyj modulo %
   * 2. Przy pomocy petli for wypisz na konsole taki output:
   *  | *
   *  | *  *
   *  | *  *  *
   *  | *  *  *  *
   *  | *  *  *  *  *
   *  użyj metody print zamiast println
   */

  public static void main(String[] args) {
    printNumbers();
    printStar();
  }

  static void printNumbers() {
    for(int i=0; i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i);
      }
    }
  }

  static void printStar() {
    for(int i=0; i < 5; i++){
      System.out.println();
      for(int j=0; j < i; j++){
        System.out.print(" * ");
      }
    }
  }

}
