package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
//	WebElement UserNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	By UserNameField = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	
//	public void insertUserName(String userName) {
//		USER_NAME_ELEMENT.sendKeys(userName);
//	}
//	
//	public void insertPassword(String password) {
//		PASSWORD_ELEMENT.sendKeys(password);
//	}
//	
//	public void clickSigninButton() {
//		SIGNIN_BUTTON_ELEMENT.click();
//	}
	
	public void performLogin(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
