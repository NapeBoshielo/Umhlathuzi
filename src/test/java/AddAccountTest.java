import co.za.umhlathuzi.Base.TestBase;
import co.za.umhlathuzi.Pages.AccountManagerPage;
import co.za.umhlathuzi.Pages.AddAccountPage;
import co.za.umhlathuzi.Pages.HomePage;
import co.za.umhlathuzi.Pages.LoginPage;
import jdk.nashorn.internal.ir.AccessNode;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAccountTest extends TestBase {
    LoginPage loginPge;
    AddAccountPage AccManager;
    HomePage homepages;
    public AddAccountTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialize();
        loginPge = new LoginPage();
        AccManager = new AddAccountPage();
        homepages=   loginPge.Login(prop.getProperty("password"),prop.getProperty("username") );
    }
    @Test
    public void accountTest (){

        homepages.account();
        AccManager.addAccount(prop.getProperty("account"),prop.getProperty("id"));

    }

//    @AfterMethod
//    public void Teardown(){
//        try {
//            Thread.sleep(3000);
//            driver.quit();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
}
