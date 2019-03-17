package eu.sii.selenium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;


public class Form {

  WebDriver driver;

  @BeforeEach
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
  }

  @Test
  public void sendFormTest() {
    new Select(driver.findElement(By.xpath("xpath"))).selectByVisibleText("text");

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.pollingEvery(Duration.ofMillis(500));
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
  }

  @Test
  public void iframeTest() {

    driver.switchTo().frame("iframe");

    WebElement element = driver.findElement(By.id("inputFirstName3"));
    element.sendKeys("first");

    element.submit();

    element.sendKeys("");
    driver.findElement(By.id("inputLastName3")).sendKeys("last");

  }

  @Test
  public void dropAndDrop(){
    driver.get("http://seleniumui.tc-sii.com/droppable.php");
    //Element which needs to drag.
    WebElement From=driver.findElement(By.id("draggable"));

    //Element on which need to drop.
    WebElement To=driver.findElement(By.id("droppable"));

    //Using Action class for drag and drop.
    Actions act=new Actions(driver);

    //Dragged and dropped.
    act.dragAndDrop(From, To).build().perform();
    String succesMsg = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
//    Assertions.assertEquals("Dropped!",succesMsg);
//    Assertions.assertTrue(succesMsg.contains("Dropped!"));

  }

  @Test
  public void test() {
      driver.get("http://seleniumui.tc-sii.com/form.php");
      driver.findElement(By.id("inputFirstName3")).sendKeys("Lukasz");
      driver.findElement(By.id("inputLastName3")).sendKeys("Krause");
      driver.findElement(By.id("inputEmail3")).sendKeys("lkrause@sii.eu");
      driver.findElement(By.id("gridRadiosMale")).click();

      WebDriverWait wait = new WebDriverWait(driver,10);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("inputFirstName3"))));

      driver.findElement(By.id("inputAge3")).sendKeys("34");
      driver.findElement(By.id("gridRadios1")).click();
      driver.findElement(By.id("gridCheckManulTester")).click();
      Select continents = new Select(driver.findElement(By.id("selectContinents")));
      continents.selectByVisibleText("Europe");
      //selectSeleniumCommands
      Select seleniumCom = new Select(driver.findElement(By.id("selectSeleniumCommands")));
      seleniumCom.selectByIndex(1);

      WebElement uploadElement = driver.findElement(By.id("chooseFile"));
//      uploadElement.sendKeys("C:\\Users\\lkrause\\Pictures\\pika.gif");
      driver.findElement(By.id("additionalInformations")).sendKeys("Hmmmmmmmmmmmmmmm");
      driver.findElement(By.xpath("/html/body/main/div/form/div[10]/div[1]/button")).click();


      String msg = driver.findElement(By.id("validator-message")).getAttribute("value");

      assertThat("Form send with success 1").isEqualToIgnoringCase(msg);
//      Assertions.assertTrue(msg.contains("Form send with success 1"));


  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

}
