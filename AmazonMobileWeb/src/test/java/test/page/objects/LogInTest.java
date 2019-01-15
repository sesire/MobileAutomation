package test.page.objects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LogIN;

public class LogInTest extends LogIN {

    LogIN objOfLogIn = null;
    HomePage objOfHomePage=null;

    @BeforeMethod
    public void initializationOfElemenets(){
        objOfLogIn = PageFactory.initElements(ad,LogIN.class);
        objOfHomePage =PageFactory.initElements(ad,HomePage.class);

    }

    //sign in using String array
    @Test
    public void signInTest(){
        objOfHomePage.signIn();
        objOfLogIn.signInPage();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


}
