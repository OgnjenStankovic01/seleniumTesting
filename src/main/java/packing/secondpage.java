package packing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.asserts.SoftAssert;
public class secondpage {
    WebDriver driver;

    By tboxButton = By.xpath("//*[@id=\"item-0\"]");
    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By adress = By.id("currentAddress");
    By submitButton = By.id("submit");
    By NameAssert = By.id("name");
    By EmailAssert = By.id("email");
    By CurrentAddressAssert = By.id("currentAddress");

    public secondpage(WebDriver driver){
        this.driver = driver;
    }
    public void getToForm() {
        driver.findElement(tboxButton).click();
    }
    public void enterName(String arg1){
        driver.findElement(fullName).sendKeys(arg1);
    }
    public void enterEmail(String arg1){
        driver.findElement(email).sendKeys(arg1);
    }
    public void enterAdress(String arg1) {
        driver.findElement(adress).sendKeys(arg1);
    }
    public void submitForm() {
        WebElement button = driver.findElement(submitButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",button);
        button.click();
    }
    public void checkTests(String arg1,String arg2, String arg3) {
        SoftAssert softAssert = new SoftAssert();
        WebElement nameassert = driver.findElement(NameAssert);
        WebElement emailassert = driver.findElement(EmailAssert);
        WebElement addressassert = driver.findElement(CurrentAddressAssert);
        String nametext = nameassert.getText();
        String emailtext = emailassert.getText();
        String addresstext = addressassert.getText();
        softAssert.assertTrue(nametext.contains(arg1));
        softAssert.assertTrue(emailtext.contains(arg2));
        softAssert.assertTrue(addresstext.contains(arg3));
    }
}
