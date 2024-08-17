package hellocucumber.utility;

import hellocucumber.CucumberHooks.Hooks;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    WebDriver driver= Hooks.driver;
    public void implictwait(Duration n)
    {
      driver.manage().timeouts().implicitlyWait(n);
    }

    public void explictwait(long n, WebElement ele)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(n));
        wait.until(d -> ele.isDisplayed());
    }
    public void fluentWit(long n, WebElement ele)
    {
        FluentWait<WebDriver> wait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(2))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(ElementNotInteractableException.class);

        wait.until(
                d -> {
                    ele.sendKeys("Displayed");
                    return true;
                });
    }
}
