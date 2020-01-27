import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class contextMenu {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/context_menu");

		Actions launchBox = new Actions(driver);
		WebElement box = driver.findElement(By.cssSelector("#hot-spot"));
		launchBox.contextClick(box).perform();

		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
		//WebElement alertBox = driver.findElement(By.)


	}
}
