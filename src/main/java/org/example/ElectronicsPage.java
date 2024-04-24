package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {

    //method for click on electronic button
    public static void clickOnElectronicsButton() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));

    }
}
