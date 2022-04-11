import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
// setup chrome browser
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
        System.out.println("The title of the page is:" + driver.getTitle());
        // Print the current URL
        String currentpage = driver.getCurrentUrl();
        System.out.println("The current URL = " + currentpage);
        //Print the page source
        String pagesource = driver.getPageSource();
        System.out.println("The page source is : " +pagesource);
        // Enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("pramukhswamimaharaj@gmail.com");
        // Enter the password to the password field
        WebElement password = driver.findElement((By.name("password")));
        password.sendKeys("4567@##");

        driver.close();


    }
}
