package page.objects;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BurgerButton extends ApplicationPageBase {

    /**
     *   Three elements are checked with single loop
     *   using list to store webelements, there is no reference available for these links
     *   use explicit wait with the condition and also iterating through  loop
     *   then using helper methods click, the web element is coming from List and
     *   string is coming from String array[]
     *   need to navigate back to homepage as every link taking us new page
     *   in order to use homepage object we need to initialize the objects
     *   with page factory.
     *
     *
     * */

    HomePage objOfHomePage =  PageFactory.initElements(ad,HomePage.class);

    String[] nameOftheEleement = {" Accounts"," Orders"," Lists"};

    @FindBy (xpath = "//a[@data-menu-id='3']")
    private WebElement amazonFresh;

    public void topElements(){
        for(int i=0; i<3;i++) {
            List<WebElement> top3buttons=ad.findElements(By.xpath("//div[@id='hmenu-top-section']//ul//li//a"));
            WebDriverWait wait = new WebDriverWait(ad,30);
            wait.until(ExpectedConditions.elementToBeClickable(top3buttons.get(i)));
            click(top3buttons.get(i),nameOftheEleement[i]);
            ad.navigate().back();
            objOfHomePage.burgerButton();
        }
    }


    public List<WebElement> buttonElementsList(){
        List<WebElement> otherElements =ad.findElements(By.xpath("//ul[@data-menu-id='1']/li/a"));
        return otherElements;
    }
/**
* making a list of webelements by xpath because there is no proper reference of the elements
* calling list in the below method using for loop, list size is used
*  index at 5 and 10 open another layout page therefore in this test i skip them
*  iterating all links of the burger button using get (i)
*  navigate back and using buger Button again
*
* */

    public void buttonElements(){
        WebDriverWait wait = new WebDriverWait(ad,30);
       // List<WebElement> otherElements =ad.findElements(By.xpath("//ul[@data-menu-id='1']/li/a"));

        for(int i = 0;i<=buttonElementsList().size()-1;i++){
            wait.until(ExpectedConditions.elementToBeClickable(buttonElementsList().get(i)));
            if(i==5 || i==10){continue;}
            click(buttonElementsList().get(i),"Element");
            ad.navigate().back();
            objOfHomePage.burgerButton();
        }


        /*
        for(WebElement i : otherElementsList()){
         //   otherElements =ad.findElements(By.xpath("//ul[@data-menu-id='1']/li/a"));

            wait.until(ExpectedConditions.elementToBeClickable(i));

            click(i,"Next Eleement");
            ad.navigate().back();


        }
            objOfHomePage.burgerButton();
*/

    }

    public List<WebElement> amazonFreshDepartment(){
        List<WebElement> list = ad.findElements(By.xpath("//ul[@data-menu-id='3']/li/a"));
        return list;
    }

    public void buttonWindowsMenu(){
        objOfHomePage.burgerButton();
        click(buttonElementsList().get(5),"Clicking Shop By department");
        click(amazonFresh,"Clicking Amazon Fresh");
        click(amazonFreshDepartment().get(5),"Frozen Food");

    }

    public boolean verifyBurgerButtonTest(){
        TestLogger.log("Confirming Test Passed");
        boolean yes =buttonElementsList().get(3).isDisplayed();
        TestLogger.log("Confirmed Test Passed");
        return  yes;

    }
}


