package eu.sii.selenium.types;

public class TypesExercises {


  /**
   * 1. Napisz metodę która sprawdzi czy paramter typu 'String' nie jest krótszy niż 3 znaki i nie jest dłuższy niż 6 znaków i zwróci typ Boolean (False jeśli warunki nie są spełnione)
   * 2. Napisz metodę która przyjmuje trzy parametry type double i zwróci ich iloczyn w postaci String'a.
   * Pierwsze dwa paramtery nie mogą być większe niż 10 a trzeci nie może być większy niż suma dwóch pierwszych.
   * Jesli warunek jest nie spelniony to pusty string "";
   * extra 3. Napisz metodę licząca funkcje kwadratową, paramtery a,b,c, wyniki na konsole(sout)
   */

  public static void main(String[] args) {
    System.out.println(checkLength("as"));
    System.out.println(checkLength("asdasd"));
    System.out.println(checkLength("12312"));

    System.out.println(checkDouble(1.0,1.0,1.0));
    System.out.println(checkDouble(11.0,1.0,11.0));
    System.out.println(checkDouble(9.0,9.0,17.0));
    System.out.println(checkDouble(9.0,9.0,18.0));
  }

  private static Boolean checkLength(String text) {
    int lenghtOftext = text.length();
    return lenghtOftext > 3 && lenghtOftext < 6;
  }

  private static String checkDouble(Double d1, Double d2, Double d3){
    if(d1 < 10 && d2 < 10 && d3 < d1+d2){
      return String.valueOf(d1*d2*d3);
    }
    return "--";
  }
}
