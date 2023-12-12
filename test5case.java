package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

//		        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

		        driver.get("http://localhost/carrental/carrental/contact-us.php");
		        
		        WebElement from_name= driver.findElement(By.name("fullname"));
		        from_name.sendKeys("Muneeb");
		        
		        WebElement email_name= driver.findElement(By.name("email"));
		        email_name.sendKeys("muneeb@gmailcom");
		        
		        WebElement contact_name= driver.findElement(By.name("contactno"));
		        contact_name.sendKeys("987654321");
		        
		        WebElement message_name= driver.findElement(By.name("message"));
		        message_name.sendKeys("what is the expected price of new Audi car");
		        
		        
		        driver.findElement(By.name("send")).click();
		        String expected_title="Car Rental|| Contact Us Page";
		        String actual_title=driver.getTitle();
		        
		        if(expected_title.equals(actual_title)) {
		        	System.out.println("you will be contacted soon test case pass");
		        }
		        else {
		        	System.out.println("test case fail");
		        }
		        

	}

}
