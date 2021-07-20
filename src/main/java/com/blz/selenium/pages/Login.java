package com.blz.selenium.pages;

import com.blz.selenium.base.BaseClass;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

@Description("Performed autoIT task " + "Created login class" +
        "Created constructor" + "Created method for login into application" +
        "Created method autoIT for uploading file" +
        "Returning title of the page.")

public class Login extends BaseClass {

    @FindBy(className = "nav__button-secondary")
    WebElement Sign_In;
    @FindBy(id = "username")
    WebElement email_or_username;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(className = "login__form_action_container")
    WebElement signin_btn;
    @FindBy(xpath = "//div[@class = 'display-flex align-items-center mt2 mr4 ml4']")
    WebElement post;
    @FindBy(xpath = "//li-icon[@type='image-icon']//*[local-name()='svg']")
    WebElement photo;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/span[1]")
    WebElement done;
    @FindBy(className = "share-box_actions")
    WebElement share;
    @FindBy(xpath = "//img[@id='ember35']")
    WebElement profile_dropdown;
    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement Sign_out;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String login_with_valid() throws InterruptedException, IOException {
        Sign_In.click();
        Thread.sleep(1000);
        email_or_username.sendKeys("vaishnavibirle1133@gmail.com");
        Password.sendKeys("vaishnavi@123");
        signin_btn.click();
        Thread.sleep(3000);
        post.click();
        photo.click();
        Thread.sleep(1000);
        autoIT();
        Thread.sleep(3000);
        done.click();
        share.click();
        Thread.sleep(2000);
        profile_dropdown.click();
        Thread.sleep(2000);
        Sign_out.click();
        Thread.sleep(3000);
        return driver.getTitle();
    }

    private void autoIT() {
        try {
            Runtime.getRuntime().exec("C:\\Users\\irg\\OneDrive\\Desktop\\AutoIT\\Upload_Photo.exe");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
