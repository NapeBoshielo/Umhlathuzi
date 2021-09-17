package co.za.umhlathuzi.Pages;

import co.za.umhlathuzi.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountManagerPage extends TestBase {

    @FindBy(xpath = "//h3[contains(text(),'Account')]")
    WebElement ClickAddAccount;

    @FindBy(xpath = "//div//span[contains(text(),'Pay Accounts')]")
    WebElement Payamountsbtn;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")
    WebElement select;


    @FindBy(xpath = "//li[contains(text(),'Once Off Debit')]")
    WebElement Selectdebit;

    @FindBy(xpath = " //button//span[contains(text(),'Continue')]")
    WebElement continu;

    @FindBy(xpath = "//div//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")
    WebElement chckbtn;

    @FindBy(xpath = "//div//button//span[contains(text(),'Continue')]")
    WebElement continu2;


    @FindBy(xpath = "//button//span[contains(text(),'Pay')]")
    WebElement pay;

    @FindBy(xpath = "//div//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")
    WebElement clickpay;

    @FindBy(xpath = "//button//span[contains(text(),'Confirm')]")
    WebElement confirm;




     public AccountManagerPage(){
         PageFactory.initElements(driver,this);
     }
    public void selectbill (){
        ClickAddAccount.click();
        try {
            Thread.sleep(3000);

            List<WebElement> myelements = driver.findElements(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget TexAlCenter']"));
            myelements.get(0).click();
            Payamountsbtn.click();
            select.click();
            Selectdebit.click();
            continu.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chckbtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(continu2));
            continu2.click();
            pay.click();
clickpay.click();
        try {
            Thread.sleep(2000);
            confirm.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Actions actions = new Actions(driver).
        // action.moveToElement(myelements).click().build().perform();

    }



}
