package test.page.objects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.BurgerButton;
import page.objects.HomePage;

public class BurgerButtonTest extends BurgerButton {

    HomePage objOfHomePage=null;
    BurgerButton objOfBurgerButton=null;

    @BeforeMethod
    public void initialiazationOfElements(){

        objOfBurgerButton = PageFactory.initElements(ad,BurgerButton.class);
        objOfHomePage= PageFactory.initElements(ad,HomePage.class);
    }
/*

    @Test
    public void topEelementTest(){
        objOfHomePage.burgerButton();

        objOfBurgerButton.topElements();
        Assert.assertTrue(objOfBurgerButton.verifyBurgerButtonTest());
    }
*/


   @Test
    public void otherElementsTest(){
       objOfHomePage.burgerButton();
       objOfBurgerButton.buttonElements();
       Assert.assertTrue(objOfBurgerButton.verifyBurgerButtonTest());
   }

/*


    @Test
    public void burgegrLayoutTestTest(){

        objOfBurgerButton.buttonWindowsMenu();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());
        


    }


*/


}

