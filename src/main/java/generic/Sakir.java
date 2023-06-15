package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sakir {
public static void main(String[] args) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://ec2-3-6-40-132.ap-south-1.compute.amazonaws.com:8443/realms/RiceFortification/protocol/openid-connect/auth?client_id=react-ui&redirect_uri=http%3A%2F%2Ffortification-uat-ui.s3-website.ap-south-1.amazonaws.com%2F&state=490f679c-7016-4903-8036-6a17a5776a44&response_mode=fragment&response_type=code&scope=openid&nonce=a03896bc-ebfb-489d-838b-623d464a1cd6&code_challenge=AvpbvGgvrtBjnRE-VDU3UfiLcw-JBIYOhsThOKurWd4&code_challenge_method=S256");
	driver.findElement(By.xpath("//button[@id='details-button']")).click();
	driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo_premixuser");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo_premixuser");
	driver.findElement(By.xpath("//input[@id='kc-login']")).click();
	driver.findElement(By.xpath("//div[text()='PREMIX']/../../descendant::div[text()='BATCH']")).click();
	driver.findElement(By.xpath("//*[name()='svg' and @data-testid='AddIcon']")).click();
	driver.findElement(By.xpath("//p[text()='Material Details']")).click();
	driver.findElement(By.xpath("//*[name()='svg' and @data-testid='AddCircleOutlineIcon']")).click();
	driver.findElement(By.xpath("//input[@id='combo-box-demo']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-15q9uuc']/descendant::input[@id='combo-box-demo']")).click();
//	driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).click();

}
}
