import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class addRemoveElementsTesting {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://the-internet.herokuapp.com/add_remove_elements/";
		driver.get(baseUrl);

		//WebElement adds object
		WebElement buttonAdd = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		buttonAdd.click();

		//WebElement removes object
		WebElement buttonDelete = driver.findElement(By.cssSelector(".added-manually"));
		//WebElement buttonDelete = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));


		String buttonDeleteText = buttonDelete.getText();
		Assert.assertEquals(buttonDeleteText, "Delete", "I added delete button");



		//buttonDelete.click();

	}
}