package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finsh extends base_page{


    public finsh(WebDriver driver) {
        super(driver);
    }


   private  By finsh= By.id("finish");




    public void click_finsh() {
        ElementActions.getInstance().click(finsh);
    }
}
