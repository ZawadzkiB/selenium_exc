package eu.sii.selenium.types;

public class Types {

  public static void main(String[] args) {
    char oneLetter;
    String someText;

    int number;
    double floatingPointNumber;

    Boolean isTrue;

    oneLetter = 's';
    someText = "lalalalalalalala";
    number = 6;
    floatingPointNumber = 3.66;
    isTrue = true;

    System.out.println("Zmienne to" +
            oneLetter + ", " +
            someText + ", " +
            number + ", " +
            floatingPointNumber + ", " +
            isTrue + ", "
            );

    /*
    Some small tests here
    ;)
     */

    System.out.println("Make all statements pass");

    checkChar(oneLetter);
    checkSomeText(someText);
    checkNumber(number);
    checkNumber(floatingPointNumber);
    checkIsTrue(isTrue);

  }

  private static void checkChar(char symbol) {
    if (symbol == 's') {
      System.out.println("Char is ok");
    } else {
      System.out.println("Char should be s");
      System.exit(0);
    }
  }

  private static void checkSomeText(String text) {
    if (text.equals("lalalalalalalala")) {
      System.out.println("Text is ok");
    } else {
      System.out.println("Text should be lalalalalalalala");
      System.exit(0);
    }
  }

  private static void checkNumber(int number) {
    if (number < 3) {
      System.out.println("Number should be gt 3");
      System.exit(0);
    } else if (number > 9) {
      System.out.println("Number should be lt 9");
      System.exit(0);
    } else {
      System.out.println("Number is ok");
    }
  }

  private static void checkNumber(double number) {
    if (number < 3.65) {
      System.out.println("Number should be gt 3.65");
      System.exit(0);
    } else if (number > 3.98) {
      System.out.println("Number should be lt 3.98");
      System.exit(0);
    } else {
      System.out.println("Number is ok");
    }
  }

  private static void checkIsTrue(Boolean is) {
    if(is){
      System.out.println("IsTrue is True");
    } else {
      System.out.println("IsTrue is False");
      System.exit(0);
    }
  }


}
