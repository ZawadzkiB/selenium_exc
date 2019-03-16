package eu.sii.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//
public class FirstJunitTest {

  /**
   * @Test Assert
   * @Before
   * @After
   */

  private int add(double a, double b) {
    return (int) (a + b);
  }

  @BeforeEach
  public void setUp() {
    System.out.println("Before");
  }

  @Test
  public void addTest() {
    System.out.println("test1");
    int result = add(1, 1);
    Assertions.assertTrue(result == 2);
  }

  @Test
  public void addTestDecimals() {
    System.out.println("test2");
    int result = add(1.55, 1.40);
    Assertions.assertTrue(result == 2);
  }

  @AfterEach
  public void tearDown() {
    System.out.println("After");
  }

}
