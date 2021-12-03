//package POM;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Passwordpage{
//    private WebDriver driver;
//
//    public Passwordpage(WebDriver driver){this.driver = driver;}
//
//    public void verifyBrandName(){
//        System.out.println("VerifyBrand");
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/img")).isDisplayed();
//    }
//    public void enterUsername(){
//        System.out.println("VerifyBrand");
//        driver.findElement(By.xpath("//*[@id=\"securityAuthentication_userName\"]")).sendKeys("Admin");
//    }
//    public void clickResetPassword(){
//        System.out.println("VerifyBrand");
//        driver.findElement(By.xpath("//*[@id=\"btnSearchValues\"]")).click();
//    }
//    public Loginpage clickCancel(){
//        System.out.println("Click cancel");
//        driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        return new Loginpage(driver);
//    }
//}
