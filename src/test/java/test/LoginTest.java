package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import basePage.AddUsers;
import util.BrowserInit;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void userShouldAbleToAddCategory() {
		driver=BrowserInit.init();
		
		AddUsers adduser = PageFactory.initElements(driver, AddUsers.class);
		adduser.addCategory("finalJavaExam");
		adduser.click_category_Botton();
		adduser.click_toggleAll_Botton();
		
	}
		@Test
		public void removeUser() {
			driver=BrowserInit.init();
			AddUsers adduser = PageFactory.initElements(driver, AddUsers.class);
			userShouldAbleToAddCategory();
			
			
			
		}
		
	}


