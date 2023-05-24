package Zegal;

import Assessment.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assessment {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        initialize();
        SearchPage();
        ClickBtn();
        AddToCart();
        Size();
    }

    public static void initialize() {
        String projectpath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void SearchPage() throws InterruptedException {
        SearchPage search = new SearchPage(driver);
        search.setSearch("Jeans");
    }
    public static void ClickBtn() throws InterruptedException {
        By ClickBtn = null;
        driver.findElement(null).click();
        Thread.sleep(5000);
    }
    public static void AddToCart() throws InterruptedException {
        By ClickBtn = null;
        driver.findElement(null).click();
        Thread.sleep(5000);
    }
    public static void Size() throws InterruptedException {
        By ClickBtn = null;
        driver.findElement(null).click();
        Thread.sleep(5000);
    }

}
