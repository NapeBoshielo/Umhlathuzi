package co.za.umhlathuzi.Base;

import co.za.umhlathuzi.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class
TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {


        try {
            prop = new Properties();
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("config.properties").getFile());

            FileInputStream ip = new FileInputStream(file);

            prop.load(ip);

        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

    }

    public  void initialize() {

        ChromeOptions options = new ChromeOptions();
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            ClassLoader classLoader = getClass().getClassLoader();
            System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
            options.addArguments("--no-sandbox");
            options.addArguments("--ignore-certificate-errors");

            driver = new ChromeDriver (options);
           // new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//label[contains(@id,recaptcha)]")));
          //  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'recaptcha-checkbox')]"))).click();


        }

        //driver manager
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));







    }

}
