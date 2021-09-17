import co.za.umhlathuzi.Base.TestBase;
import co.za.umhlathuzi.Pages.LoginPage;
import co.za.umhlathuzi.Pages.RegisterPage;
import co.za.umhlathuzi.Utilities.Utils;
import jdk.internal.dynalink.beans.StaticClass;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest extends TestBase {
    RegisterPage Registr;

    public RegisterTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialize();
        Registr = new RegisterPage();

    }
    @DataProvider
    public static Object[][]gettestdatas(){
        Object data[][] =Utils.getTestData("Register");
        return data;
    }


    @Test(priority = 1,dataProvider = "gettestdatas")
    public void validatenewnames(String uns,String inits,String nameNs,String surnameS,String IDs,String Emails){
try{

    Registr.PageReg(uns,inits, nameNs, surnameS, IDs, Emails);

    String Actual = driver.getCurrentUrl();
    Assert.assertEquals(Actual,"https://www.uat.e-umhlathuze.co.za/euMhlathuze/home","wrong input");

} catch (Exception e) {
    e.printStackTrace();
    Assert.fail();
}


    }


}














































/*
@DataProvider

public Object[][]getUmhlazidata(){
    Object data[][]=TestUtil.getTestData(SheetName);
    return data;
}
@Test(priority = 1,dataProvider="getumhlData");
public void validatenewname(String title,String username)

Registr.Registerprofile(UserN,tittle)
 */