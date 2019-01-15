package test.page.objects;

import application.page.base.ApplicationPageBase;
import base.MobileAPI;
import com.util.xlsx.reader.MyDataReader;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LogIN;

import java.io.File;


public class LogInUsingExcelSheetTest extends MobileAPI {
    LogIN objOfLogIn = null;
    HomePage objOfHomePage=null;

    @BeforeMethod
    public void initializationOfElemenets(){
        objOfLogIn = PageFactory.initElements(ad,LogIN.class);
        objOfHomePage =PageFactory.initElements(ad,HomePage.class);

    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @Test(dataProvider ="DP" )
    public void invalidSignInReadingExcelFile(String emailaddress,String enterpassword){
        objOfHomePage.signIn();
        objOfLogIn.signInUsingExcel(emailaddress,enterpassword);
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());
    }

}
