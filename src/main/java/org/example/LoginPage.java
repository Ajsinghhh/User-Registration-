package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //method for login details
    public void enterLoginDetails() {
        // type email
        typeIn(By.className("email"), email);
        //type password
        typeIn(By.id("Password"), password);
        //click on login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

    }


}
