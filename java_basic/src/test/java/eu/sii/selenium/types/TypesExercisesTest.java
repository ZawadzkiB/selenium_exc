package eu.sii.selenium.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TypesExercisesTest {

  @ParameterizedTest
  @ValueSource(strings = { "as", "asdd", "asdasdasdasd" })
  public void checkLength(String text){
    Assertions.assertTrue(TypesExercises.checkLength(text));
  }

}