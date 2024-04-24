package org.example;

import org.openqa.selenium.By;

public class CameraPhotoPage extends Utils {

    //method for click on caner button
    public static void clickOnCameraPhotoButton() {
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']"));
    }

}
