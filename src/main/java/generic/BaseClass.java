package generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.Log_inHomePage;

public class BaseClass {
protected PropertyUtility property;
protected WebDriverUtility web;
protected WebDriver driver;
public WebDriver sdriver;
protected Log_inHomePage log;

@Test
public void launchbrowser()
{
	property=new PropertyUtility();
	property.confipath(IConstantPath.Properties_path);
	String browser=property.fetchproperty("browser");
	String url=property.fetchproperty("url");
	long time=Long.parseLong(property.fetchproperty("time"));
	
    String user=property.fetchproperty("user");
    String pwd=property.fetchproperty("pwd");
	web=new WebDriverUtility();
	web.launch(browser, url, time, driver);
	
	}




}
