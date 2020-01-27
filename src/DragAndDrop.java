import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DragAndDrop {

	WebDriver driver;

	@Test
	public void DragAndDrop() {
		String baseUrl = "http://the-internet.herokuapp.com/drag_and_drop";
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//Element which needs to drag
		WebElement From = driver.findElement(By.cssSelector("#column-a"));
		//WebElement From = driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));

		//Element which needs to drop
		WebElement To = driver.findElement(By.cssSelector("#column-b"));
		//WebElement To = driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
		WebElement columnBHeader = driver.findElement(By.xpath("//div[@id='column-b']/header"));

		//Using Action class for drag and drop
		Actions actions = new Actions(driver);

		String columnBHeaderText = columnBHeader.getText();


		//Find objects' locations
		Point locationFrom = From.getLocation();
		//System.out.println("A is " + locationFrom);

		Point locationTo = To.getLocation();
		//System.out.println("B is " + locationTo);

		//Dragged and dropped
		actions.dragAndDrop(From, To).build().perform();

		Assert.assertEquals(columnBHeaderText, "A", "Column header should be A");
		}
	}
