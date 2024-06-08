import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logout {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		
		WebElement username =driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
		
		username.sendKeys("Nada@25");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
		
		password.sendKeys("Nada25@");
		
		WebElement loginbutton =driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		
		loginbutton.click();
		
		driver.findElement(By.id("logout2")).click();

	}

}
