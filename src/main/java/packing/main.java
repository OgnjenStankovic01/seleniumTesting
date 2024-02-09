package packing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class main {
    pomref objHomePage;
    secondpage objtextBoxPage;
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ognjen\\Downloads\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }
    @Test(priority = 1 )
    public void navToForm(){
        objHomePage = new pomref(driver);
        objHomePage.goToPage();
    }
    @Test(priority = 2)
    public void completeForm(){
        objtextBoxPage = new secondpage(driver);
        objtextBoxPage.getToForm();
        objtextBoxPage.enterName("Pognjen Stankovic");
        objtextBoxPage.enterAdress("Adresa");
        objtextBoxPage.enterEmail("realemail@gmail.com");
        objtextBoxPage.submitForm();
        objtextBoxPage.checkTests("Pognjen Stankovic","realemail@gmail.com","realemail@gmail.com");
    }
}
