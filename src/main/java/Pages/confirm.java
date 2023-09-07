package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirm extends base_page{

    public confirm(WebDriver driver) {
        super(driver);
    }



       private  By fname= By.id("first-name");
       private  By lname=By.id("last-name");
       private By code= By.id("postal-code");
       private  By continue_btn= By.id("continue");


    public void data_to_confirm(String first,String last,String CODE){

      ElementActions.getInstance().type(fname,first);
        ElementActions.getInstance().type(lname,last);
        ElementActions.getInstance().type(code,CODE);
        ElementActions.getInstance().click(continue_btn);
}
}
