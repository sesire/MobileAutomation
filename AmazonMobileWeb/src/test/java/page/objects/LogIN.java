package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIN extends ApplicationPageBase {

        HomePage objOfHomePage = new HomePage();

    String[] email= {"aaafnan","aaaff","Saeed","Muhammad","AR","Aisha"};
    String [] password= {"1543","654","87654","98765","87654","98765"};

        @FindBy(id="ap_email_login")
        private WebElement emailBox;

        @FindBy(xpath="//input[@placeholder='Amazon password']")
        private WebElement passwordBox;

        @FindBy(id="signInSubmit")
        private WebElement signInButton;

        public void signInPage(){

            for(int i =0; i<6;i++) {
                sendKeys(email[i], emailBox);
                sendKeys(password[i], passwordBox);
                click(signInButton, "Clicked Sign In Button");
            }

        }


        public void signInUsingExcel(String email,String password){

            sendKeys(email,emailBox);
            sendKeys(password,passwordBox);
            click(signInButton, "Clicked Sign In Button");
        }



}
