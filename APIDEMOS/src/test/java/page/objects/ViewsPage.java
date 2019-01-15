package page.objects;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewsPage extends ApplicationPageBase {

        HomePage objofHomePage = PageFactory.initElements(ad,HomePage.class);

/**  View Animation*/
        @FindBy(id ="Animation")
        private WebElement animation;

        @FindBy(id ="3D Transition")
        private WebElement threeDAnimation;

        @FindBy(xpath ="//android.widget.TextView[@text='Tahoe Pier']")
        private WebElement lakeTahoe;

        /** View Interpolator*/
        @FindBy(id="Interpolators")
        private WebElement interpolators;

        @FindBy(xpath="//android.widget.TextView[@text='Accelerate']")
        private WebElement accelerate;

        @FindBy(xpath="//android.widget.CheckedTextView[@text='Anticipate']")
        private WebElement anticipate;

        @FindBy(id="Shake")
        private WebElement forverification;

        /** view AutoComplete*/

        @FindBy(id="Auto Complete")
        private WebElement autoComplete;

        @FindBy(id="3. Scroll")
        private WebElement scroll;

        @FindBy(id="Country")
        private WebElement country;

        @FindBy(id="io.appium.android.apis:id/edit")
        private WebElement countryBox1;



    public void viewAnimation(){
            objofHomePage.viewsTap();
            click(animation,"Animation");
            click(threeDAnimation,"3 D Animation");
            click(lakeTahoe,"Lake Tahoe");
            ad.navigate().back();
        }


        public void viewInterpolator(){
            objofHomePage.viewsTap();
            click(animation,"Animation");
            click(interpolators,"Interpolators");
            click(accelerate,"Accelerate");
            click(anticipate,"Anticipate");
            ad.navigate().back();
        }


        public WebElement verification(){
            return testPassedLog(forverification);
        }

        public void viewAutoComplete() throws InterruptedException {
            objofHomePage.viewsTap();
            click(autoComplete,"Auto Complete");
            click(scroll,"Scroll ");
            ad.scrollTo("Country");

            TestLogger.log("Scrolled");

            sendKeys("pak ",countryBox1);

            Thread.sleep(3000);
            //ad.tap(1,540,1115,0);
            ad.hideKeyboard();

            ad.navigate().back();
        }


        public WebElement verificationAutocomplete(){
            return testPassedLog(scroll);
        }




}
