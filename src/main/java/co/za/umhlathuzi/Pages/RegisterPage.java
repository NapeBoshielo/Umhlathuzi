package co.za.umhlathuzi.Pages;

import co.za.umhlathuzi.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Register')and @class='ui-link ui-widget']")
    WebElement Registerclick;

    @FindBy(xpath = "//input[@maxlength=50]")
    WebElement usernameTextbox;

    @FindBy(xpath = "//li[contains(text(),'Mr') and @data-label='Mr']")
    WebElement titleTextbox;

    @FindBy(xpath = "//li[@data-label='South African ID']")
    WebElement TypeIDSelect;

    @FindBy(xpath = "//li[contains(text(),'SM')")
    WebElement RegistrationPreSelect;

    @FindBy(xpath = "//input[@maxlength='13']")
    WebElement IDnumberTextbox;

    @FindBy(xpath = "//input[@maxlength='200']")
    WebElement EmailTextbox;

    @FindBy(xpath = "//li[@data-label='Email']")
    WebElement emailClick;

    @FindBy(xpath = "//span[contains(@class,'chkbox')]")
    WebElement checkbox;

    @FindBy(xpath = "//button//span[contains(text(),'Register')]")
    WebElement regclick;


//   @FindBy(xpath = "//span[@role='checkbox']")
//    WebElement recapture;
    public RegisterPage(){
        PageFactory.initElements(driver,this);

    }
//
public void PageReg (String un,String init,String nameN,String surnameS,String ID,String Email){
    Registerclick.click();
        usernameTextbox.sendKeys(un);
    List<WebElement> MyelementsList = driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']"));
   MyelementsList.get(0).click();
   titleTextbox.click();
    List<WebElement> MyelementsList2 = driver.findElements(By.xpath("//input[@maxlength='100' and contains(@id,'regCustomContent')]"));
    MyelementsList2.get(0).sendKeys(init);
    MyelementsList2.get(1).sendKeys(nameN);
    MyelementsList2.get(2).sendKeys(surnameS);
    MyelementsList.get(1).click();
    TypeIDSelect.click();
    IDnumberTextbox.sendKeys(ID);
    MyelementsList.get(2).click();
    emailClick.click();
    EmailTextbox.sendKeys(Email);
    checkbox.click();
regclick.click();



}




}















/*public void createnewcontact(String userN,string tittle,String)

List<Webelement>myele = driver.find();

username.sendkey(userN)


 */