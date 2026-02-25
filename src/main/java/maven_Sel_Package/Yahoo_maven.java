package maven_Sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo_maven {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); 
        
        WebDriver driver = new ChromeDriver();    
        
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com");
        driver.findElement(By.id("login-username")).sendKeys("nisarga01");
        Thread.sleep(1000);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("login-passwd")).sendKeys("Nisu@2003");
        driver.findElement(By.id("login-signin")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("ybarMailLink")).click();
        
        //driver.quit();
        System.out.println("LOGIN SUCCESS");
  }

}
