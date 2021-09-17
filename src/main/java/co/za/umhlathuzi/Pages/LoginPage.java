package co.za.umhlathuzi.Pages;

import co.za.umhlathuzi.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//b")
    WebElement Log;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Login')]")
    WebElement Loginbutton;

    @FindBy(xpath = "//i[@class='icon-logout']")
    WebElement logout;

    public LoginPage(){
        PageFactory.initElements(driver,this);

    }


    public HomePage Login(String pass, String user){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.click();
        Password.sendKeys(pass);
      username.sendKeys(user);
      Loginbutton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  logout.click();
return new HomePage();
    }

}
