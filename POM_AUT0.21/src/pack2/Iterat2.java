package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack1.Ietrat1;

@Test
public class Iterat2 {
	WebDriver Driver;

    Ietrat1 y;

    

   

@BeforeTest

public void Setup () {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\jzo_0\\eclipse-workspace1\\POM_AUT0.21\\chromedriver.exe");

    Driver = new ChromeDriver();

    Driver.manage().window().maximize();

    Driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

    String URL1 = ("http://automationpractice.com/index.php");

    Driver.get(URL1);

    }             





public void OpenSignInPage () {

    y = new Ietrat1(Driver);

    y.OpenSignInPage();

    String SignInPageTitle = y.SignInPageTitle();

    Assert.assertTrue(SignInPageTitle.contains("Login - My Store"));

    System.out.println(SignInPageTitle);

    }
}
