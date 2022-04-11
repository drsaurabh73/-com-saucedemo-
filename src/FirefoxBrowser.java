import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // open URl
        driver.get(baseUrl);
        // Print the title of the page
        System.out.println("THe title of the page is :" +driver.getTitle());
        //Print the current URL
        System.out.println("The Current Url of the page is " +driver.getCurrentUrl());
        // Print the page source
        System.out.println("The page source is =" +driver.getPageSource());
        //Enter the email to the email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("pramukhswamimaharaj@gmail.com");
        // Enter the password in the password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("4567@##");

        //close browser
        driver.close();

    }
}
