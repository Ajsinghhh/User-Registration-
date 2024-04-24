package org.example;

import org.openqa.selenium.By;

public class LeicaTMirrorlessDigitalCameraPage extends Utils {
    //method for click on product
    public static void clickOnLeicaTMirrorlessDigitalCameraButton() {
        clickOnElement(By.xpath("//h2[@class='product-title']//a[normalize-space()='Leica T Mirrorless Digital Camera']"));
    }
}
