import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverTest1 {
    @Test
    void TestRemoteWebDriver() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver webDriver = new RemoteWebDriver(new URL("http://172.31.9.56:4444"), chromeOptions){};

        webDriver.navigate().to("https://www.google.com/");

        webDriver.quit();
    }
}
