package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtestcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

//	        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

	        driver.get("http://localhost/carrental/carrental/car-listing.php");
	        driver.findElement(By.className("btn")).click();
	        String expected_title="Car Rental | Vehicle Details";
	        String actual_title=driver.getTitle();
	        
	        if(expected_title.equals(actual_title)) {
	        	System.out.println("Cannot get vehcile details");

	        }
	        else {
	        	System.out.println("get vehcile details successfully");

	        }


	        

	}

}
