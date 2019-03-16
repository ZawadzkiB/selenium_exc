package eu.sii.selenium.loops;

public class Loop {

  public static void main(String[] args) {


    for(int i=0; i < 10; i++) {
      System.out.println("Loop 1: " + i);
    }

    System.out.println("--------------");

    for(int i=1; i <= 5; i++) {
      System.out.println("Loop 2: " + i);
    }

    System.out.println("--------------");

    for(int i=0; i < 20; i+=2) {
      System.out.println("Loop 3: " + i);
    }

    System.out.println("--------------");

    for(int i=10; i > 0; i--) {
      System.out.println("Loop 4: " + i);
    }

    int j = 10;
    while(j > 0) {
      System.out.println("While: " + j);
      j--;
    }

  }

}
