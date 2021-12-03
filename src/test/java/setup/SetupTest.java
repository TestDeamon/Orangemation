package setup;

//import POM.Passwordpage;

import POM.Loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupTest {
    private WebDriver driver;
    protected Loginpage loginpage;
//    protected Passwordpage passwordpage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")).click();

//        passwordpage = new Passwordpage(driver);
        loginpage = new Loginpage(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
