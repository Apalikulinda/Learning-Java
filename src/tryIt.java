import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryIt {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = null;
		Double i= (Double) js.executeScript("var element = document.getElementById('hplogo');var position = element.getBoundingClientRect();return position.left");
		System.out.print(i);

	}
}

/*WebDriver driver=new FirefoxDriver();
   driver.get("http://www.google.com");
   JavascriptExecutor js=(JavascriptExecutor) driver;
   Double i= (Double) js.executeScript("var element = document.getElementById('hplogo');var position = element.getBoundingClientRect();return position.left");
   System.out.print(i);*/