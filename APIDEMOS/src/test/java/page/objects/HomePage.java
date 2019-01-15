package page.objects;

import application.page.base.ApplicationPageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends ApplicationPageBase {


    @FindBy(id = "Accessibility")
    private WebElement accessibility;

    @FindBy(id="Accessibility Node Provider")
    private WebElement verifyAccessibility;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Animation']")
    private WebElement animation;

    @FindBy(id="Bouncing Balls")
    private WebElement verifyAnimation;

    @FindBy(id = "App")
    private WebElement app;

    @FindBy(id="Action Bar")
    private WebElement verifyApp;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Content']")
    private WebElement content;

    @FindBy(id="Assets")
    private WebElement verifyContent;

    @FindBy(id = "Graphics")
    private WebElement graphics;

    @FindBy(id="AnimateDrawables")
    private WebElement verifyGraphics;

    @FindBy(id = "Media")
    private WebElement media;

    @FindBy(id="VideoView")
    private WebElement verifyMedia;

    @FindBy(id = "NFC")
    private WebElement nfc;

    @FindBy(id="TechFilter")
    private WebElement verifyNfc;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='OS']")
    private WebElement os;

    @FindBy(id="Rotation Vector")
    private WebElement verifyOs;

    @FindBy(id = "Preference")
    private WebElement preference;

    @FindBy(id="1. Preferences from XML")
    private WebElement verifyPreference;

    @FindBy(id = "Text")
    private WebElement text;

    @FindBy(id="LogTextBox")
    private WebElement verifyText;

    @FindBy(id = "Views")
    private WebElement views;

    @FindBy(id="Buttons")
    private WebElement verifyViews;



    public void animatonTap()
    {

        homePageTap(animation,"Animation");
    }

    public WebElement VerifyAnimation(){
        return testPassedLog(verifyAnimation);
    }



    public void accessibilityTap(){
        homePageTap(accessibility,"Animation");
    }

    public WebElement Verifyaccessibility(){
        return testPassedLog(verifyAccessibility);
    }


    public void appTap(){
        homePageTap(app,"App");
    }

    public WebElement VerifyApp(){
        return testPassedLog(verifyApp);
    }


    public void contentTap(){
        homePageTap(content,"Content");
    }

    public WebElement VerifyContent(){
        return testPassedLog(verifyContent);
    }


    public void graphicsTap(){
        homePageTap(graphics,"Graphics");
    }

    public WebElement VerifyGraphics(){
        return testPassedLog(verifyGraphics);
    }


    public void mediaTap(){
        homePageTap(media,"media");
    }

    public WebElement VerifyMedia(){
        return testPassedLog(verifyMedia);
    }


    public void nfcTap(){
        homePageTap(nfc,"nfc");
    }

    public WebElement VerifyNfc(){
        return testPassedLog(verifyNfc);
    }


    public void osTap(){
        homePageTap(os,"os");
    }

    public WebElement VerifyOS(){
        return testPassedLog(verifyOs);
    }

    public void preferenceTap(){
        homePageTap(preference,"Preference");
    }

    public WebElement VerifyPreference(){
        return testPassedLog(verifyPreference);
    }


    public void textTap(){
        homePageTap(text,"text");
    }

    public WebElement VerifyText(){
        return testPassedLog(verifyText);
    }


    public void viewsTap(){
        homePageTap(views,"Views");
    }

    public WebElement VerifyViews(){
        return testPassedLog(verifyViews);
    }










}
