import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basicAuth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");

		driver.switchTo().alert();
		driver.findElement(By.id("userID")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.switchTo().alert().accept();

		System.out.println("I set the fields with texts");

	}
}
//no way!