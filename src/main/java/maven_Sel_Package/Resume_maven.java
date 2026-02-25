package maven_Sel_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Resume_maven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\nisar\\Downloads\\NISARGAK_Resume.pdf");
	        Thread.sleep(1000);

	    
	        driver.findElement(By.id("file-submit")).click();
	        Thread.sleep(1000);
	        

	        driver.quit();
	    }
		

	}



