package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;

//method for open and close browser
public class BrowserManager extends Utils {

    public void openBrowser() {
        //open browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.nopcommerce.com/");
    }

    //close browser
    public void closeBrowser() {

        driver.quit();
    }
}
