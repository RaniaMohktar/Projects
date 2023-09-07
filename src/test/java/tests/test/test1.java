package tests.test;

import Pages.*;
import com.shaft.driver.DriverFactory;
import com.shaft.enums.internal.ElementAction;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.ReportManager;
import org.apache.tools.ant.taskdefs.condition.Contains;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
    WebDriver driver;
    login L = new login(driver);
    products p=new products(driver);
    cart c=new cart(driver);
    confirm co=new confirm(driver);
    finsh f=new finsh(driver);
    confirmation_page cp= new confirmation_page(driver);


    @BeforeMethod
    public void set_up(){
      driver = DriverFactory.getDriver();
      BrowserActions.getInstance().navigateToURL("https://www.saucedemo.com/");
    }


    @Test
    public void Order() throws InterruptedException {

      L.user_login("standard_user","secret_sauce");
      p.select_item();
      c.click_checout();
      co.data_to_confirm("Rania","Mokhtar","123");
      f.click_finsh();
      String conf_msg=  cp.get_conf_msg();
      Assertions.assertEquals("Thank you for your order!",conf_msg);
        Thread.sleep(3000);
    }






    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}



// String west= "sauce-labs-bike-light";
//ElementActions.getInstance().click(By.xpath("//*[contains(@id,'{west}')]"));