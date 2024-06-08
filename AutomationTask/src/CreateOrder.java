import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrder {

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
		
		driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		
		WebElement name =driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("Nada");
		
		WebElement country =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("Egypt");
		
		WebElement city =driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Cairo");
		
		WebElement card =driver.findElement(By.xpath("//*[@id=\"card\"]"));
		card.sendKeys("123");
		
		WebElement month =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		month.sendKeys("August");
		
		WebElement year =driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.sendKeys("2025");
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();

	}

}
