import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AbstractClass {

    public static void inputData(WebElement el, String data) {
        el.sendKeys(data);
    }

    public static void clickBtn(WebElement el, WebDriver driver) {
        try {
            el.click();
        } catch (Exception e) {
            new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
            el.click();
        }
    }
}
