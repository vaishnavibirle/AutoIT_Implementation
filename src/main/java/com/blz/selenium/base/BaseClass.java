package com.blz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Description("Created Base class for setting up browser")
public class BaseClass {
    public  static WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

}
