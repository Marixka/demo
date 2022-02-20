import Pages.PageElementsHome;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    static WebDriver driver;



    protected static WebDriver getWebDriver() {
        if (driver == null) {

            //определение пути до драйвера и его настройка
            System.setProperty("webdriver.chrome.driver", Veribles.getChromeDriverName());
            //создание экземпляра драйвера
            driver = new ChromeDriver();
            //окно разворачивается на полный экран
            driver.manage().window();
            //задержка на выполнение теста = 10 сек.
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        } else return driver;

    }

    protected static void waitElements(WebElement el) {
        WebDriverWait wait =   new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(el));


    }
    protected static void waitElementsClick(WebElement el) {
        WebDriverWait wait =   new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(el));


    }


    protected static void FindElements(Object page) {
        PageFactory.initElements(driver, page);
    }
    protected void click(WebElement el) {
        for (int i=0; i<10; i++) {
            try {
                el.click();
                break;
            } catch (Exception e) {
                new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
            }
        }

    }


}
