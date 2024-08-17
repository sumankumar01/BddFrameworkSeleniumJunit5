package hellocucumber.CucumberHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {


    public static WebDriver driver;

    @Before
    public void beforeScenario(){
        WebDriverManager.chromedriver().driverVersion("127.0.6533.119").setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void afterScenario(){

        driver.close();

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
