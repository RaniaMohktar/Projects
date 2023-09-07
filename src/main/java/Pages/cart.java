package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cart extends base_page {

    public cart(WebDriver driver) {
        super(driver);
    }


    private  By check_btn=By.xpath("//*[text()='Checkout']");



        public void click_checout(){

            ElementActions.getInstance().click(check_btn);
        }
}
