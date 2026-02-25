package SelMAV_TNG_PACKAGE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LOGIN_CSV {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "csvData")
    public void loginTest(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    @DataProvider(name = "csvData")
    public Object[][] getDataFromCSV() throws IOException {
        String filePath = "src/test/resources/login.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        int rowCount = 0;

        while ((line = br.readLine()) != null) {
            rowCount++;
        }
        br.close();

        br = new BufferedReader(new FileReader(filePath));
        Object[][] data = new Object[rowCount - 1][2];
        int i = 0;

        br.readLine(); 

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            data[i][0] = values[0];
            data[i][1] = values[1];
            i++;
        }
        br.close();

        return data;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
