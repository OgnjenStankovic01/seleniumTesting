package packing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;


public class pomref {
    WebDriver driver;
    By ebutton = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div");
    String realurl = "https://demoqa.com/elements";

    public pomref (WebDriver driver) {
        this.driver = driver;
    }
    public void goToPage() {
        driver.findElement(ebutton).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(realurl, currentUrl);
    }
}

