import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	
		WebElement username =driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
		
		username.sendKeys("Nada@25");
	
		WebElement password =driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
		
		password.sendKeys("Nada25@");
		
		WebElement signupbutton =driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
		
		signupbutton.click();
	

	}

}
