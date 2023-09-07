package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends base_page{
    public login(WebDriver driver) {
        super(driver);
    }


       private  By  Username = By.id("user-name");
       private By Password =By.id("password");
       private  By login_btn=By.id("login-button");


        public void user_login(String usernane,String password){

            ElementActions.getInstance().type(Username,usernane);
            ElementActions.getInstance().type(Password,password);
            ElementActions.getInstance().click(login_btn);

        }


}
