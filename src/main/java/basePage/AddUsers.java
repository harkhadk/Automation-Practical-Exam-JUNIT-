package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUsers {
	
	WebDriver driver;
	
	
	
	public AddUsers (WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how = How.NAME, using ="data") WebElement Add_Category_Element;
	@FindBy(how =How.NAME, using ="submit") WebElement Add_category_Botton;
	@FindBy(how =How.NAME, using ="allbox") WebElement toggleAll_Botton;
	@FindBy(how =How.XPATH, using ="//input[@name='todo[0]']") WebElement remove_list_item;
	@FindBy(how =How.XPATH, using ="//input[@value='Remove']") WebElement clickon_remove_list_itemButton;
	
	
	
	public void addCategory(String category) {
		Add_Category_Element.sendKeys(category);
	}
	
			
	public void click_category_Botton() {
		Add_category_Botton.click();
	}
	public void click_toggleAll_Botton() {
		toggleAll_Botton.click();
		if (toggleAll_Botton.isSelected()) {
			System.out.println("checkbox is toggled");
	}else {
		System.out.println("checkbox is not toggled");
		}
		
	}
		
		public void remove_single_list_item() {
			remove_list_item.click();
			clickon_remove_list_itemButton.click();
			
		}
		
		
	}



