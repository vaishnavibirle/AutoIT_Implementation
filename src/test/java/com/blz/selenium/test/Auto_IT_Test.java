package com.blz.selenium.test;

import com.blz.selenium.base.BaseClass;
import com.blz.selenium.pages.Login;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

@Description("Created test class for logging into application" +
        "Also provided validations for checking whether test case is passed or not")

public class Auto_IT_Test extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException, IOException {
        Login login = new Login(driver);
        String actualTitle = login.login_with_valid();
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Your file is uploaded successfully");
    }
}
