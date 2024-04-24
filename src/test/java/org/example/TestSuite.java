package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    //Objects for scanner class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();

    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();

    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    //ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();
    }


    @Test
    public void toVerifyRegisteredUserShouldBeAbleToLogin() {


        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();

        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        loginPage.enterLoginDetails();
        //verify user logged in successfully
    }

    @Test
    public void toVerifyRegisteredUserShouldBeAbleToReferAProductToAFriend() {
        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        loginPage.enterLoginDetails();
        //verify user logged in successfully

        //click on Electronics Button
        ElectronicsPage.clickOnElectronicsButton();

        //Click on Camera & photo Button
        CameraPhotoPage.clickOnCameraPhotoButton();

        //Click on Product(Leica T Mirrorless Digital Camera)
        LeicaTMirrorlessDigitalCameraPage.clickOnLeicaTMirrorlessDigitalCameraButton();

        //Click Email a Friend
        EmailAFriendPage.emailAFriend();


        //ignore the below I need it for my own reference , I know in realtime it shouldn't be like this

        //enter email a friends details and click send email submit button

        //Type Your Email Address

        //Type Personal Message

        //Click Send Email

        //Verify Email sent (capture message displayed)
    }

    @Test
    public void buildYourOwnComputer() {

        //click on build your own computer (through h   ome page)
        homePage.clickOnBuildYourOwnComputer();

        //from the processor drop down list , select the second option
        buildYourOwnComputerPage.selectDetailsToBuildYourOwnComputer();

        //ignore the below I need it for my own reference , I know in realtime it shouldn't be like this

        //from the RAM drop down list, select the second option

        //from HDD select second option

        //from OS select second option

        //from software select second option

        //click add to cart button

        //click shopping cart button

        //verify product in cart with message displayed
    }

}


