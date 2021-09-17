import co.za.umhlathuzi.Base.TestBase;
import co.za.umhlathuzi.Pages.HomePage;
import co.za.umhlathuzi.Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomepageTest extends TestBase {
LoginPage loginPge;

HomePage homepages;
public HomepageTest(){
    super();
}

    @BeforeMethod
    public void setup(){
        initialize();
        loginPge = new LoginPage();
     homepages=   loginPge.Login(prop.getProperty("password"),prop.getProperty("username") );
    }
@Test
    public void accountTest (){

    homepages.account();
    }

    @AfterMethod
    public void Teardown(){
        try {
            Thread.sleep(3000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
