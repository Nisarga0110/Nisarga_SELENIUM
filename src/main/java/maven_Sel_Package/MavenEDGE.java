package maven_Sel_Package;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class MavenEDGE {

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup(); //for maven setup
        
        WebDriver driver = new EdgeDriver();    
        
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Title:"+driver.getTitle());
        driver.quit();
    }
}
