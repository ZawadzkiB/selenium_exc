package eu.sii.selenium.shopizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniCart {

  private final WebDriver driver;
  private final WebDriverWait wait;

  public MiniCart(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
    new Actions(driver).moveToElement(driver.findElement(By.cssSelector("#miniCartSummary a")))
            .build().perform();
  }


  public CheckoutPage openCheckout() {
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checkout-bg > a")))
            .click();
    return new CheckoutPage(driver);
  }
}
