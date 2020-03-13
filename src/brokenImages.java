import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class brokenImages {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/broken_images");

		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: " + allImages.size());


		/*
		for (WebElement image: driver.findElements(By.cssSelector ("img")))
		{
			brokenImages(image);
		}
		*/

	}
}


//struggled!