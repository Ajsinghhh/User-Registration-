package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

public class Utils extends BasePage {
    //time stamp
    public static String email = "abcd" + random() + "ajsingh@gmail.com";
    //store password
    public static String password = "singh1";
    //store friends email

    public static String friendsEmail = "abcd" + random() + "testing@gmail.com";

    //method for click action
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //method for type action

    public static void typeIn(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //method for capture text

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    //method for verify URL

    public static void verifyURLContains(String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url), "Incorrect URL");
    }

    //method for drop down by text selection
    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //method for drop down by index selection
    public static void selectByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //method for drop down by value selection
    public static void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //method for Implicit
    public static void implicitWaitMethod() {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    //method for Explicit wait
    public static void explicitWaitMethod(By by) {
        WebElement driverWait = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(by));
    }

    //method for sleep
    public static void sleep(int time) {
        try {
            Thread.sleep(time * 20L);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            // verify the message
            //public static void voidVerifyProductNameIsSameAsYourProductInToCart(){



    }
}

