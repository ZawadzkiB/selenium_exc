package eu.sii.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstTest {

  WebDriver driver;

  @BeforeEach
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
  }


  @Test
  public void openGoogleAndSearch() throws InterruptedException {
    driver.get("http://google.com");
    WebElement element = driver.findElement(By.name("q"));
    Thread.sleep(5000);
    element.sendKeys("obiad");
    element.submit();
    List<WebElement> results = driver.findElements(By.cssSelector(".r h3"));
    Assertions.assertTrue(results.stream().allMatch(it -> it.getText().toUpperCase().contains("OBIAD")));
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

}
