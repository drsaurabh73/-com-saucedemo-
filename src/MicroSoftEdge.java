import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdge {
    public static void main(String[] args) {
// setup edge driver
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //open the URL
        driver.get(baseUrl);
        //Print the title page
        System.out.println("The title of the page is: " + driver.getTitle());
        //print the current URL
        System.out.println("The current URL = " + driver.getCurrentUrl());
        // print the page soucre
        System.out.println("The page soucre is = " + driver.getPageSource());
        //Enter the email in the email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("pramukhswamimaharaj@gmail.com");
        // Enter the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("4567@##");

        driver.close();
    }
}
