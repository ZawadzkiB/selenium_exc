# TODO:

## Setup pom.xml

- Surefire plugin
- JUnit dependencies
- Selenium dependency


## Download chromedriver

http://chromedriver.chromium.org/downloads

put it in src/main/resources

## Write test for searching in google

How to setup chrome driver:
http://chromedriver.chromium.org/getting-started

    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    WebDriver driver = new ChromeDriver();

1. open google.com


    driver.open("http://google.com");

2. search for "obiad"


    WebElement element = driver.findElement(By.xpath("xpath_selector_here"));
    element.sendKeys("obiad");
    element.submit();

3. check that all results headers contains "obiad" word


    List<WebElement> elements = driver.findElements(By.xpath("xpath_selector_here"));
    //write here method for checking list, check that all elements contains text "obiad"
    //to get text of element use element.getText(); method

## Write tests for
http://seleniumui.tc-sii.com/

### Form test

http://seleniumui.tc-sii.com/form.php

1. Form send with success
2. Form invalid (missing field, incorrect email)

How to deal with selects -> https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
How to deal with upload file -> https://www.guru99.com/upload-download-file-selenium-webdriver.html

### IFrame tests

http://seleniumui.tc-sii.com/iframes.php

How to deal with iframe -> https://www.guru99.com/handling-iframes-selenium.html

1. Send two forms

### Drag and drop

http://seleniumui.tc-sii.com/droppable.php

How to deal with drag and drops | actions -> https://www.guru99.com/drag-drop-selenium.html

1. Drag and drop

### Parse table

http://seleniumui.tc-sii.com/table.php

1. Write method to parsing table rows

2. Write test for finding all peeks from alps and checking it size is 10

3. Write test for finding all peeks from switzerland and checking it size is 7