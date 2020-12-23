package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Ietrat1 {
	
	
		WebDriver Driver;

		@FindBy(tagName="title")

		WebElement title;

		@FindBy(className="login")

		WebElement login;

		 

		public Ietrat1(WebDriver Driver) {

		                this.Driver = Driver;

		PageFactory.initElements(Driver, this); 

		}

		 

		public String MainPageTitle() {

		    return Driver.getTitle();

		}

		 

		public void SignIn() {

		                login.click();

		                }

		 

		public String SignInPageTitle() {

		                return Driver.getTitle();

		                }

		 

		public void OpenSignInPage() {

		                this.MainPageTitle();

		                this.SignIn();

		                this.SignInPageTitle();

	}
}
