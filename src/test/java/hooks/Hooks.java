package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

@Before

    public void createDriver(){
    WebDriverManager.chromiumdriver().setup();
    WebDriver driver = new ChromeDriver();
    BasePage.setDriver(driver);
}

@After

    public void quiteDriver(){BasePage.getDriver().quit();}

}
