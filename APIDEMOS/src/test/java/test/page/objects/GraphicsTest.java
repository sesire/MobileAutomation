package test.page.objects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.Graphics;

public class GraphicsTest extends Graphics {


    Graphics objOfGraphics = null;


    @BeforeMethod
    public void initializationOfElemeents(){
        objOfGraphics = PageFactory.initElements(ad,Graphics.class);
    }

   @Test
    public void compassTest() throws InterruptedException {
        objOfGraphics.compass();
        Assert.assertTrue(objOfGraphics.verifyCompass().isDisplayed());

    }

    @Test
    public void verticesTest() throws InterruptedException {
        objOfGraphics.vertices();
        Thread.sleep(3000);
        ad.navigate().back();
        //Assert.assertFalse(objOfGraphics.verifyCompass().isDisplayed());

    }
/*
    @Test
    public void touchPaintTest() throws InterruptedException {
        objOfGraphics.touchPaint();
        ad.navigate().back();
        //Assert.assertTrue(objOfGraphics.verifyCompass().isDisplayed());

    }*/

    @Test
    public void openGLTest() throws InterruptedException {
        objOfGraphics.openGL();
    }

    @Test
    public void patternTest() throws InterruptedException {
        objOfGraphics.pattern();
    }

    @Test
    public void paintFingerTest() throws InterruptedException {
        objOfGraphics.fingerPaint();
    }

}
