package basicweb;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mtextcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

        driver.get("http://localhost/carrental/carrental/index.php");
        
        WebElement full_name= driver.findElement(By.name("fullname"));
        full_name.sendKeys("abdullah");
        
        WebElement mobile_no= driver.findElement(By.name("mobileno"));
        mobile_no.sendKeys("03111214567");
        
        WebElement email_name= driver.findElement(By.name("emailid"));
        email_name.sendKeys("abdullah@gmail.com");
        
        WebElement password_name= driver.findElement(By.name("password"));
        password_name.sendKeys("qazws123");
        
        WebElement cpassword_name= driver.findElement(By.name("confirmpassword"));
        cpassword_name.sendKeys("qazws123");
        
        driver.findElement(By.name("signup")).click();
        String expected_title="Car Rental Portal";
        String actual_title=driver.getTitle();
        
        if(expected_title.equals(actual_title)) {
        	System.out.println("login successfully");
        }
        else {
        	System.out.println("login failed");
        }

        
        

	}

}
