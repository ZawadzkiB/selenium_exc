package eu.sii.selenium.shopizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {

  private final WebDriver driver;
  private final WebDriverWait wait;

  public MainPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  public void checkWelcomeMessage() {
    String welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".click_menu span"))).getText();
    assertThat(welcomeMessage).containsIgnoringCase("test-a123");
  }

  public void clickFirstCategory() {
    driver.findElements(By.cssSelector(".mainmenu li")).get(0).click();
  }
}
