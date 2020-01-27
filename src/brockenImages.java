import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class brockenImages {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");

		List<WebElement> images = driver.findElements(By.tagName("img"));
		Iterator <WebElement> it = images.iterator();

		System.out.println();





	}
}


//struggled!