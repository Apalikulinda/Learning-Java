import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");

		WebElement option1 = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(1) form:nth-child(2) > input:nth-child(1)"));
		option1.click();

		if (option1.isSelected()){
			System.out.println("The first checkbox is toggled on");
		}
		else {
			System.out.println("The first checkbox is toggled off");
		}


		WebElement option2 = driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(1) form:nth-child(2) > input:nth-child(3)"));
		option2.click();

		if (option2.isDisplayed()) {
			System.out.println("The first checkbox is toggled off");
		}
		else {
			System.out.println("The first checkbox is toggled on");
		}
	}
}
