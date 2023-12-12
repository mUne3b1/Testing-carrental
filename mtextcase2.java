package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtextcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

//		        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

		        driver.get("http://localhost/carrental/carrental/vehical-details.php?vhid=3");
		        WebElement from_date= driver.findElement(By.name("fromdate"));
		        from_date.sendKeys("12/12/2023");
		        WebElement to_date= driver.findElement(By.name("todate"));
		        to_date.sendKeys("17/12/2023");
		        
		        WebElement from_message= driver.findElement(By.name("message"));
		        from_message.sendKeys("got a good car");
		        
		        driver.findElement(By.name("submit")).click();
		        String expected_title=" Car Rental Portal - My Booking";
		        String actual_title=driver.getTitle();
		        
		        if(expected_title.equals(actual_title)) {
		        	System.out.println("login successfully");
		        }
		        else {
		        	System.out.println("login failed");
		        }

		        
		        

	}

}
