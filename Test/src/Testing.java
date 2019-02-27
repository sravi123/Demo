

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import com.thoughtworks.selenium.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import com.thoughtworks.selenium.Wait;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Chitumalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	d.findElement(By.id("email")).sendKeys("Tomato");
	d.close();

		
		//System.out.print("HELLOOOOOOOOO");
		
		
		

	}

}
