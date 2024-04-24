package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {
    //method for email a friend
    public static void emailAFriend() {
        //click on email a friend button
        clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));
        // type friends email
        typeIn(By.id("FriendEmail"), friendsEmail);
        //type your email
        typeIn(By.id("YourEmailAddress"), email);
        //type a personal message
        typeIn(By.id("PersonalMessage"), "checkitout");
        //click on send email
        clickOnElement(By.xpath("//button[normalize-space()='Send email']"));
    }
}
