package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //method for click on registration button
    public void clickOnRegisterButton() {

        clickOnElement(By.linkText("Register"));
    }

    // method for click on login button
    public void clickOnLoginButton() {
        clickOnElement(By.className("ico-login"));
    }

    //method for click on build your own computer
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(By.xpath(" // img[@title='Show details for Build your own computer']"));

    }

}
