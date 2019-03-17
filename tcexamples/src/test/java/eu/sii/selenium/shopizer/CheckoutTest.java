package eu.sii.selenium.shopizer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

  private WebDriver driver;
  private WebDriverWait wait;

  private LoginPage loginPage;
  private MainPage mainPage;

  @BeforeAll
  static void config() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setup() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 10);
    driver.get("http://demo.shopizer.com:8080/shop/customer/customLogon.html");
    loginPage = new LoginPage(driver);
    mainPage = new MainPage(driver);
  }

  @Test
  void checkoutTest() {
    loginPage.login();
    mainPage.checkWelcomeMessage();
    mainPage.clickFirstCategory();


    WebElement addToCart = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.cssSelector("#productsContainer .addToCart"))).get(0);

    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
    wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();

    new Actions(driver).moveToElement(driver.findElement(By.cssSelector("#miniCartSummary a")))
            .build().perform();

    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checkout-bg > a")))
            .click();

    assertThat(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.cssSelector("#mainCartTable tbody tr"))).size()
    ).isEqualTo(1);
  }


  @AfterEach
  void tearDown() {
    driver.quit();
  }


}
