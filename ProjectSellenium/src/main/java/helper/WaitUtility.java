package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {
    public static void waitUntil(WebDriver driver, int timeout, ExpectedCondition<?>expectedCondition){
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
        webDriverWait.until(expectedCondition);
    }
}
