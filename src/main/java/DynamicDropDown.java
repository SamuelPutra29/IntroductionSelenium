import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samue\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();}}


//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

              /*  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

                driver.findElement(By.xpath("//a[@value='BLR']")).click();

                Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

                driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); // this is the method for DynamicDropDown Parent Child relationship that's why inside the method using space not one slash

                driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

            }



        }




    }
}*/
