package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class products extends base_page {

    public products(WebDriver driver) {
        super(driver);
    }

    private By filter_btn=By.xpath("//*[@class='product_sort_container']");
    private By item= By.xpath("//*[contains(@id,'sauce-labs-bike-light')]");
   private By cart_btn= By.xpath("//*[@class='shopping_cart_link']");


     public void select_item(){
         ElementActions.getInstance().select(filter_btn,"Price (low to high)");
         ElementActions.getInstance().click(item);
         ElementActions.getInstance().click(cart_btn);



        }
}
