package registerpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCRF001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/tutorialsninja.com/demo");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstnameField = driver.findElement(By.id("input-firstname"));
		firstnameField.sendKeys("Nawanka");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Thathsara");
		
	    WebElement	emailField = driver.findElement(By.id("input-email")); 
		emailField.sendKeys("nawanka.t@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("0766771782");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("12345");
		
		WebElement inputPassword = driver.findElement(By.id("input-confirm"));
		inputPassword.sendKeys("12345");
		
		WebElement privacyPolicyField =driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		continueButton.click();
		
		
		//checking whether the user has successfully logged-in or not
		myAccountDropMenu.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		logoutOption.click();
	}

}
