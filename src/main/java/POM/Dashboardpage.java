package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
    private WebDriver driver;
    public Dashboardpage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWelcomeAdmin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
    }

    public Loginpage clickLogout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
        return new Loginpage(driver);
    }
}
