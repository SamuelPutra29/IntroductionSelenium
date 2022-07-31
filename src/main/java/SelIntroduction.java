import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {


        // invoking browser
        // Chrome - ChromeDriver - Methods
        // Firefox - FirefoxDriver - Methods
        // Every methods in Selenium is the same for any drivers
        // if you want to acces the methods inside the driver, so we have to make a new object

        // First: Get driver browser and install in local machine
        // And you have to check with which version of your browser

        // chrome driver.exe -> Chrome Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samue\\Documents\\chromedriver.exe");

        //  WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
