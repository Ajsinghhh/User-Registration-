package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    //method for registration details
    public void enterRegistrationDetails() {

        verifyURLContains("register");
        // click on register button
        clickOnElement(By.className("ico-register"));
        //type firstname
        typeIn(By.id("FirstName"), "Aj");
        //type lastname
        typeIn(By.id("LastName"), "Singh");
        selectByVisibleText(By.name("DateOfBirthDay"), "5");
        //type email
        typeIn(By.id("Email"), email);
        //type password
        typeIn(By.id("Password"), password);
        //retype password
        typeIn(By.id("ConfirmPassword"), password);
        //click on register submit button
        clickOnElement(By.id("register-button"));


    }


}
