package page.objects;

import application.page.base.ApplicationPageBase;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class App extends ApplicationPageBase {

    TouchAction act = new TouchAction(ad);

    @FindBy(id="App")
    private WebElement app;

    @FindBy(id="Alert Dialogs")
    private WebElement alertDialog;

    @FindBy(xpath = "//android.widget.Button[@index='2']")
    private WebElement thirdAlert;

    @FindBy(xpath = "//android.widget.Button[@index='1']")
    private WebElement thirdAlertPopUp;

    @FindBy(id="List dialog")
    private WebElement listDialog;

    @FindBy (xpath = "//android.widget.TextView[@index='1']")
    private WebElement commondTwo;

    @FindBy (id="Progress dialog")
    private WebElement processDialog;

    @FindBy (xpath="//android.widget.Button[@index='0']")
    private WebElement cancelProgressDialog;

    @FindBy (id="Single choice list")
    private WebElement singleChoiceList;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Traffic']")
    private WebElement singleChoiceTrafficradiobutton;

    @FindBy(xpath = "//android.widget.Button[@index='0']")
    private WebElement singleChoiceTrafficOKbutton;

    @FindBy(xpath = "//android.widget.Button[@index='8']")
    private WebElement textEntry;

    @FindBy(xpath = "//android.widget.EditText[@index='1']")
    private WebElement nameTextBox;

    @FindBy(xpath = "//android.widget.EditText[@index='1']")
    private WebElement passwordTextBox;

    @FindBy(id="Menu")
    private WebElement menu;

    @FindBy (id="Inflate from XML")
    private WebElement xml;

    @FindBy(xpath = "//android.widget.TextView[@text='Title only']")
    private WebElement dropdown;

    @FindBy(xpath="//android.widget.CheckedTextView[@text='Shortcuts']")
    private WebElement dropdownOrder;

    @FindBy(id="Speak!")
    private WebElement speak;

    @FindBy(xpath = "//android.widget.TextView[@text='hi']")
    private WebElement verifyVoiceTest;

    public void appAlert(){

//        act.singleTap(app).perform();
        app.click();
        alertDialog.click();
        thirdAlert.click();
        thirdAlertPopUp.click();
        listDialog.click();
        commondTwo.click();
//       act.tap(415,1500).perform();
        ad.navigate().back();
        processDialog.click();
//        cancelProgressDialog.click();
        singleChoiceList.click();
        singleChoiceTrafficradiobutton.click();
        singleChoiceTrafficOKbutton.click();
        textEntry.click();
        nameTextBox.sendKeys("Afnan");
        passwordTextBox.sendKeys("Saeed");
        ad.hideKeyboard();
        singleChoiceTrafficOKbutton.click();

    }


    public void appMenu(){

        app.click();
        menu.click();
        xml.click();
//        act.tap(1005,240).perform();
        dropdown.click();
        dropdownOrder.click();
    }


    public void voiceRecognition(){

        app.click();
        ad.scrollTo("Voice Recognition").click();
        speak.click();
        // user need to say Hi

    }


    public String verifyVoiceRecognition(){

        return verifyVoiceTest.getText();
    }




}
