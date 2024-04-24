package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    //expected vs actual message
    String expectedRegisterSuccessMessage = "Your registration completed";

    //verify message for user registration
    public void verifyUserRegisteredSuccessfully() {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), expectedRegisterSuccessMessage);
    }


}



