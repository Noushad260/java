package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_inHomePage {

	@FindBy(name="user_name")
	private WebElement user;
	   @FindBy(name="user_password")
	   private WebElement pwd;
	       @FindBy(id="submitButton")
	       private WebElement clickbutton;
    public Log_inHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    public void user(String user1)
    {
    	user.sendKeys(user1);
    }
        public void pwd(String pwd1)
        {
           pwd.sendKeys(pwd1);
           }
               public void clickbutton()
               {
            	   clickbutton.click();
               }
      
}
