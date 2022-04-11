import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

    String browser = "edge";
    String baseUrl = "https://www.saucedemo.com/";
   WebDriver driver;

    public void multiBrowser() {
        if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
           driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
           driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect Browser name ");
        }
        driver.get(baseUrl);


    }

    public static void main(String[] args) {
        MultipleBrowser obj4 = new MultipleBrowser();
        obj4.multiBrowser();

    }
}
