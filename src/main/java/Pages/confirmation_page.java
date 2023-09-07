package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmation_page extends base_page {


    public confirmation_page(WebDriver driver) {
        super(driver);
    }

    private  By text= By.xpath("//*[@class='complete-header']");



    public String get_conf_msg() {
        String msg = ElementActions.getInstance().getText(text);
        return msg;
    }
}
