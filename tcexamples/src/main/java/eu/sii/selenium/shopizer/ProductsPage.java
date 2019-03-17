package eu.sii.selenium.shopizer;

import eu.sii.selenium.shopizer.util.CustomWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

  private final WebDriver driver;
  private final WebDriverWait wait;
  private final CustomWaits waits;

  public ProductsPage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver,10);
    this.waits = new CustomWaits(driver);
  }

  public ProductsPage clickFirstProduct() {
    WebElement addToCart = waits.waitForAllElements(By.cssSelector("#productsContainer .addToCart")).get(0);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
    wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    return this;
  }

  public MiniCart openMiniCart() {
    return new MiniCart(driver);
  }
}
