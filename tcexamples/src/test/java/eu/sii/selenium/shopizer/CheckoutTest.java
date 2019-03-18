package eu.sii.selenium.shopizer;

import eu.sii.selenium.shopizer.util.CustomWaits;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutTest {

  private WebDriver driver;
  private WebDriverWait wait;

  private CustomWaits waits;

  private LoginPage loginPage;

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
    waits = new CustomWaits(driver);
  }

  @Test
  void checkoutTest() {
    loginPage.login()
            .assertWelcomeMessage()
            .clickFirstCategory()
            .clickFirstProduct()
            .openMiniCart()
            .openCheckout()
            .assertThatNumberOfDifferentItemsIsCorrect(1);
  }

  @AfterEach
  void tearDown() {
    driver.quit();
  }


}
