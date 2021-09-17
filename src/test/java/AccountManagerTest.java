import co.za.umhlathuzi.Base.TestBase;
import co.za.umhlathuzi.Pages.AccountManagerPage;
import co.za.umhlathuzi.Pages.AddAccountPage;
import co.za.umhlathuzi.Pages.HomePage;
import co.za.umhlathuzi.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountManagerTest extends TestBase {

    LoginPage loginPge;
    HomePage homepages;
    AccountManagerPage managerP;
    public AccountManagerTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialize();
        loginPge = new LoginPage();
        managerP = new AccountManagerPage();
        homepages=   loginPge.Login(prop.getProperty("password"),prop.getProperty("username") );
    }
@Test
  public void PayAccount(){

        managerP.selectbill();

        String url = driver.getCurrentUrl();
    Assert.assertEquals(url,"https://www.uat.e-umhlathuze.co.za/euMhlathuze/payment-instruction");

  }



}
