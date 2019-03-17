package eu.sii.selenium.shopizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPage {

  private final WebDriver driver;
  private final WebDriverWait wait;


  public CheckoutPage(WebDriver webDriver) {
    this.driver = webDriver;
    this.wait = new WebDriverWait(driver,10);
  }

  public CheckoutPage assertThatNumberOfDifferentItemsIsCorrect(int number) {
    assertThat(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.cssSelector("#mainCartTable tbody tr"))).size()
    ).isEqualTo(number);
    return this;
  }
}
