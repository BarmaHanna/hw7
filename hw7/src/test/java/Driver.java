import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://onliner.by");
            driver.findElement(By.xpath("//span[text()='Автобарахолка']")).click();
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
            driver.findElement(By.xpath("//input[@value='Авто']/following-sibling::span")).click();
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
            driver.findElement(By.xpath("//input[@value='price']/following-sibling::span")).click();
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
            driver.findElement(By.xpath("//input[@value='brand']/following-sibling::span")).click();
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
            driver.findElement(By.xpath("//input[@value='city']/following-sibling::span")).click();
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
            driver.quit();
        }
    }

