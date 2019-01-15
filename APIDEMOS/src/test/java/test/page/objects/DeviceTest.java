package test.page.objects;

import base.MobileAPI;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

public class DeviceTest extends MobileAPI {



    @Test
    public void rotateTest(){
        ad.rotate(ScreenOrientation.LANDSCAPE);
    }


    @Test
    public void lockScreenTest(){
        ad.lockScreen(2);
    }



}
