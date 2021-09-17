import co.za.umhlathuzi.Base.TestBase;
import co.za.umhlathuzi.Pages.HomePage;
import co.za.umhlathuzi.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest  extends TestBase {
    LoginPage logins;
    HomePage homepage;
    public LoginTest(){

        super();
    }
    @BeforeMethod
    public void setup(){
        initialize();
        logins = new LoginPage();

    }

    @Test(priority = 1)
    public void LoginPage(){

   homepage = logins.Login(prop.getProperty("password"),prop.getProperty("username") );
        Assert.assertEquals(driver.getTitle(),"e-uMhlathuze","Wrong page");
    //Assertions




    }}
