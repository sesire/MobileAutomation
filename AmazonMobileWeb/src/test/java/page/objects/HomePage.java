package page.objects;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import com.mongodb.gridfs.CLI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage extends ApplicationPageBase {


    @FindBy (id="nav-hamburger-menu")
    private WebElement burgerButton;

    @FindBy (id="nav-logobar-greeting")
    private WebElement signIn;

    @FindBy (id="nav-button-cart")
    private WebElement cartButton;

    @FindBy (xpath="//android.view.View[@text='Amazon']")
    private WebElement logoAmazonToHomePage;

    //Search Box
    @FindBy (id="nav-search-keywords")
    private WebElement searchTextBox;

    @FindBy (className="nav-search-submit")
    private WebElement searchMagnifyIcon;  //

    @FindBy (id="glow-ingress-single-line")
    private WebElement selectLocation;

    @FindBy(id = "GLUXSignInButton")
    private WebElement selectLocationConfirm;

    @FindBy(id="nav-logobar")
    private WebElement verifyLogoAmazon;

    //Navigation Bar 6 tabs
    @FindBy (id="deals")
    private WebElement deals;
    @FindBy (id="wholefoods")
    private WebElement wholeFoods;
    @FindBy (id="prime")
    private WebElement prime;
    @FindBy (id="fresh")
    private WebElement fresh;
    @FindBy (id="video")
    private WebElement video;
    @FindBy (id="music")
    private WebElement music;


    //for assertion this method will be used

    public WebElement verifyLogo(){
        TestLogger.log("Confirming Logo is there");
        WebElement logo = verifyLogoAmazon;
        TestLogger.log("Confirmed Logo is there");
        return logo;

    }




   public void signIn(){
        click(signIn,"Sign In");

    }


    public void burgerButton(){
        click(burgerButton,"Burger Button");

    }

    public void cartButton(){
        click(cartButton,"Cart Button");

    }


    public void searchTextBox(String whatTosearch){

        sendKeys(whatTosearch,searchTextBox);
    }


    public void searchMagnifyIcon(){
        click(searchMagnifyIcon,"Search Icon");

    }


    public void selectLocation(){
        click(selectLocation,"Selecting Location");

        WebDriverWait wait = new WebDriverWait(ad,30);
        wait.until(ExpectedConditions.elementToBeClickable(selectLocationConfirm));
        click(selectLocationConfirm," Confirm");
    }


    public void deals(){
        click(deals,"Deals");

    }


    public void wholeFoods(){
        click(wholeFoods,"Whole Foods");

    }


    public void prime(){
        click(prime,"Prime");

    }

    public void fresh(){
        click(fresh,"Fresh");

    }

    public void video(){
        click(video,"Video");

    }

    public void music(){
        click(music,"Music");

    }



}
