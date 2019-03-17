package eu.sii.selenium.shopizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage {

  private final WebDriver driver;
  private final WebDriverWait wait;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  public LoginPage login() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin_userName")));
    driver.findElement(By.id("signin_userName")).sendKeys("ddff@dd.ff");
    driver.findElement(By.id("signin_password")).sendKeys("test1234");
    driver.findElement(By.id("genericLogin-button")).click();
    return this;
  }

}
