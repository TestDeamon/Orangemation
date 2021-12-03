package login;

import POM.Dashboardpage;
import org.testng.annotations.Test;
import setup.SetupTest;

public class LoginTest extends SetupTest {
//    protected Passwordpage passwordpage;
    @Test(priority = 1)
    public void testLogin() throws InterruptedException{
        Thread.sleep(3000);
        loginpage.userDetails();
        Dashboardpage dashboardpage = loginpage.clickLogin();
        dashboardpage.clickWelcomeAdmin();
        loginpage = dashboardpage.clickLogout();
    }
}
