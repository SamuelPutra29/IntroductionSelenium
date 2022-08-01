import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


/*
    CSS Selector
    There are 3 ways to locate the object by using CSS
    1. ClassName -> tagname.classname -> Button.signInBtn
    2. Id -> tagname#id -> input#inputUsername
    3. Tagname[attribute='value'] -> this is the generic way
    example:<<
    -> <input type="text>
    Input[type='text']

    XPATH
    1.//Tagname[@attribute='value']
    exp. //Input[@type='text']











 */



public class Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samue\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5 ));
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Samuel");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("samueltest@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("samtest@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("12412214");
        driver.findElement(By.xpath("//div/button[2]")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();


    }



}
