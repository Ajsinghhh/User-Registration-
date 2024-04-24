package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputerPage extends Utils {

    //method for build your on computer
    public void selectDetailsToBuildYourOwnComputer() {

        //from the processor drop down list , select the second option
        selectByVisibleText(By.xpath("//select[@name='product_attribute_1']"), "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

        //from the RAM drop down list, select the second option
        selectByVisibleText(By.xpath("//select[@name='product_attribute_2']"), "4GB [+$20.00]");

        //from HDD select second option
        clickOnElement(By.xpath("//label[@for='product_attribute_3_7']"));

        //from OS select second option
        clickOnElement(By.xpath("//label[@for='product_attribute_4_9']"));

        //from software select second option
        clickOnElement(By.id("product_attribute_5_11"));

        //click add to cart button
        clickOnElement(By.xpath("//button[@class='button-1 add-to-cart-button']"));

        //click on shopping cart button
        clickOnElement(By.xpath("//li[@id='topcartlink']"));

        //clickOnElement(By.xpath("//span[@class='cart-label']"));
       // clickOnElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
        //verify product in cart with message displayed
        String expectedNameOfProduct = "Build your own computer";

        String actual = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(getTextFromElement(By.className("product-name")), expectedNameOfProduct);
        ;


    }


}

