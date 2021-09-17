package co.za.umhlathuzi.Pages;

import co.za.umhlathuzi.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddAccountPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Add Account')]")
    WebElement ClickAddAccount;

    @FindBy(xpath = "//span[contains(text(),'Add')]")
    WebElement clickadd;

    public AddAccountPage (){
        PageFactory.initElements(driver,this);

    }

    public void addAccount (String account,String idNum){

        ClickAddAccount.click();
        List<WebElement> MyelementList = driver.findElements(By.xpath("//input[@maxlength='100' and contains(@id,'inputText')]"));
        MyelementList.get(0).sendKeys(account);
        MyelementList.get(1).sendKeys(idNum);
        clickadd.click();
    }




}
