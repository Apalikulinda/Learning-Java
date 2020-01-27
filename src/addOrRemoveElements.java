import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addOrRemoveElements {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://the-internet.herokuapp.com/add_remove_elements/";
		driver.get(baseUrl);

		WebElement buttonAdd = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		buttonAdd.click();

		System.out.println("I added element!");


		WebElement buttonDelete = driver.findElement(By.cssSelector(".added-manually"));
		buttonDelete.click();
		System.out.println("I deleted element!");
	}
}
