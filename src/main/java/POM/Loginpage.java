package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    public Loginpage(WebDriver driver){
        this.driver = driver;
    }

    public void userDetails(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    public Dashboardpage clickLogin(){
        driver.findElement(By.id("btnLogin")).click();
        return new Dashboardpage(driver);
    }


}
