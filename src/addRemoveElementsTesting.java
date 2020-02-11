import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addRemoveElementsTesting {
	WebDriver driver;

	@Test
	public void addRemoveElementsTesting () {

		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://the-internet.herokuapp.com/add_remove_elements/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//WebElement adds object
		WebElement buttonAdd = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		buttonAdd.click();

		//WebElement removes object
		//WebElement buttonDelete = driver.findElement(By.cssSelector(".added-manually"));
		WebElement buttonDelete = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));

		//Check if new button is visible
		if (buttonDelete.isDisplayed()) {
			System.out.println("New button is visible");
		}

		//Check added button with button's text
		String buttonDeleteText = buttonDelete.getText();
		System.out.println("New button has text " + buttonDeleteText);

		Assert.assertEquals(buttonDeleteText, "Delete!", "I didn't add correct delete button");


/*
		//Delete object
		buttonDelete.click();
		if (buttonDelete.isDisplayed()) {
			System.out.println("I didn't delete button");
		}
		else {
			System.out.println("I deleted delete button");
		}
		*/

		//boolean buttonDelete = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).getAttribute("enable") == "enable";


		/*
		How to check that the bottom was removed?
		 */


	}
}