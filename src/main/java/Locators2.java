import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators2 {
    public static void main(String[]args) throws InterruptedException{
        String name = "rahul";
    System.setProperty("webdriver.chrome.driver","C:\\Users\\samue\\Documents\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String password = getPassword(driver);
    driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys(name);
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    driver.findElement(By.className("signInBtn")).click();
    Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello " + name + ",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/button[2]")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        String[] passwordArray2 = passwordArray[1].split("'");
       String password = passwordArray2[0];
        //String password = passwordArray[1].split("'")[0];
        return password;




                // 0th index - Please use temporary password
                // 1st index - rahulshettyacademy to login
    }



}