package test.page.objects;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.App;

public class AppTest extends App {

    App objOfApp = null;


    @BeforeMethod
    public void initializationOfElemeents(){
        objOfApp = PageFactory.initElements(ad,App.class);
    }


    @Test
    public void appAlertTest(){
        objOfApp.appAlert();
        //need assertion
    }


    @Test
    public void menuTest(){
        objOfApp.appMenu();
    //need assertion
    }


    @Test
    public void voiceRecognitionTest(){
        objOfApp.voiceRecognition();
        Assert.assertEquals("hi",objOfApp.verifyVoiceRecognition());
    }





}
