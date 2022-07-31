import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TacxApp {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samue\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://cloud.tacx.com/#/login");
        driver.findElement(By.xpath("//div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Samueldianpermanaputra@gmail.com");

    }
}
