package maven_Sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Login {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); 
        
        WebDriver driver = new ChromeDriver();    
        
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/accountchooser?dsh=S469885005%3A1771222057386598&ifkv=ASfE1-ooQKc4EwwmY6s2Vdv83zpwe6e7Od9lV-CfVRCChFxFYJQ0dq60Hh4O7brras47oZY8n0BiaA&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.className("pGzURd"));
        driver.quit();
        

	}

}
