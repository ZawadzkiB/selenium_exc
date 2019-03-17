package eu.sii.selenium.shopizer.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CustomWaits {

  private final WebDriverWait wait;

  public CustomWaits(WebDriver driver) {
    this.wait = new WebDriverWait(driver, 10);
  }

  public List<WebElement> waitForAllElements(By by) {
    return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
  }
}
