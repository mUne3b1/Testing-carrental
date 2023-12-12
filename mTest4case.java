package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mTest4case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

//        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

        driver.get("http://localhost/carrental/carrental/admin/index.php");
        
        WebElement from_name= driver.findElement(By.name("username"));
        from_name.sendKeys("admin");
        
        WebElement pass_name= driver.findElement(By.name("password"));
        pass_name.sendKeys("Test@12345");
        
        driver.findElement(By.name("login")).click();
        String expected_title="Car Rental Portal | Admin Dashboard";
        String actual_title=driver.getTitle();
        
        if(expected_title.equals(actual_title)) {
        	System.out.println(" Admin  login successfully");
        }
        else {
        	System.out.println(" Admin login failed");
        }
        
        

	}

}
