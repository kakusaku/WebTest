import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
//        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.baidu.com/");
        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("hello Selenium!");
        element.submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}