package eu.sii.selenium.shopizer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {

  WebDriver driver;
  WebDriverWait wait;

  @BeforeEach
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 10);
    driver.get("http://demo.shopizer.com:8080/shop/customer/customLogon.html");
  }

  @Test
  void loginTest() {
    driver.findElement(By.id("signin_userName")).sendKeys("ddff@dd.ff");
    driver.findElement(By.id("signin_password")).sendKeys("test1234");
    driver.findElement(By.id("genericLogin-button")).click();

    String welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".click_menu span"))).getText();

    assertThat(welcomeMessage).containsIgnoringCase("test-a123");
  }


  @AfterEach
  public void tearDown() {
    driver.quit();
  }

}
