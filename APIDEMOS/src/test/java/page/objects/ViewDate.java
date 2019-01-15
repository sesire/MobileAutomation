package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewDate extends ViewsPage {

    /** Date Widgets*/

    @FindBy(id="Date Widgets")
    private WebElement dateWidgets;

    @FindBy(id="1. Dialog")
    private WebElement dateDialog;

    @FindBy(id="change the date")
    private WebElement changeDate;

    @FindBy(id="17 April 2019")//817,619
    private WebElement selectDate;

    @FindBy(xpath = "//android.widget.Button[@text='OK']")
    private WebElement oK;

    /** Time setting*/
    @FindBy(id="change the time")
    private WebElement selectTime;

    @FindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='5']")
    private WebElement selectTime7;




    public void viewDateLocal(){
        objofHomePage.viewsTap();
        click(dateWidgets,"Date Widgets");
        click(dateDialog,"Date Dialogs");
        click(changeDate, "Change Date");
        ad.tap(1,817,619,1);
        ad.tap(1,817,619,1);
        ad.tap(1,817,619,1);
        click(selectDate, "Date 17 April, 2019");
        click(oK,"OK");


    }

    public void viewChangeTime(){
        objofHomePage.viewsTap();
        click(dateWidgets,"Date Widgets");
        click(dateDialog,"Date Dialogs");
        click(selectTime,"Selecting Time");
        click(selectTime7,"7");
        click(oK,"Ok");

    }


    public WebElement verifydateLocal(){
        return testPassedLog(changeDate);
    }







}
