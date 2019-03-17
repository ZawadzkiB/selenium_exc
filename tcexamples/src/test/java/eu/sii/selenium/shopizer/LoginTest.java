package eu.sii.selenium.shopizer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

  private WebDriver driver;

  private LoginPage loginPage;
  private MainPage mainPage;

  @BeforeAll
  static void config() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setup() {
    driver = new ChromeDriver();
    driver.get("http://demo.shopizer.com:8080/shop/customer/customLogon.html");
    loginPage = new LoginPage(driver);
    mainPage = new MainPage(driver);
  }

  @Test
  void loginTest() {
    loginPage.login();
    mainPage.assertWelcomeMessage();
  }


  @AfterEach
  void tearDown() {
    driver.quit();
  }

}
