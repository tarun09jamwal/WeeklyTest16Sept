package Test;

import Page.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.Duration;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

    @Parameters("browserName")
    @BeforeClass
    public static void Setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demo.nopcommerce.com");
            pageFactory = new PageFactory(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demo.nopcommerce.com");
            pageFactory = new PageFactory(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
    }

    @AfterClass
    public static void Logout() {

        driver.close();
    }

}




