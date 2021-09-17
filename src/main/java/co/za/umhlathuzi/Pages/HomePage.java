package co.za.umhlathuzi.Pages;

import co.za.umhlathuzi.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//div[@class='homePageServicesHeading']/h3[contains(.,'Account')]")
    WebElement ClickAccountbtn;

    public HomePage(){
        PageFactory.initElements(driver,this);

    }

    public AccountManagerPage account(){

        ClickAccountbtn.click();


return new AccountManagerPage();
    }

}
