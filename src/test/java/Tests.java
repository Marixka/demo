import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;

public class Tests extends Elements{
    WebDriver driver;


    @Before
    public void setup() {
        LOG.info("Start @BeforeClass()...");
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ReadVariable.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ReadVariable.getProperty("windowsPage"));
        FindElements(driver);

        LOG.info("Finish @BeforeClass()...");

    }

    @After
    public void close() {

        driver.close();
        LOG.info("closeBrowser()...");
        LOG.info("Finish test " + this.getClass().getSimpleName());
    }

    /*
     * Проверка, что окно заказа доступно на главной странице
     * окно статичное
     * заявка отправляется
     */
    @Test
    public void formWindow1Test() throws InterruptedException {


        AbstractClass.inputData(name, ReadVariable.getProperty("name"));
        AbstractClass.inputData(telephone, ReadVariable.getProperty("telephone"));
        AbstractClass.clickBtn(personalDate, driver);
        AbstractClass.clickBtn(button, driver);

        Thread.sleep(1000L);
        Assert.assertEquals("Спасибо, ваша заявка принята!", windowFree.getText());
    }

    /*
     * Проверка, что окно заказа доступно и заявка отправляется
     */
    @Test
    public void formWindow2Test() throws InterruptedException {
        AbstractClass.clickBtn(userMenu, driver);
        Thread.sleep(500L);

        AbstractClass.inputData(userForm2, ReadVariable.getProperty("name2"));
        AbstractClass.inputData(telephone2, ReadVariable.getProperty("telephone"));
        AbstractClass.clickBtn(personalDate2, driver);
        AbstractClass.clickBtn(button2, driver);
        Thread.sleep(500L);
        Assert.assertEquals("Спасибо, ваша заявка принята!", windowFree.getText());
    }

    /*
    * Проверка, что окно заказа доступно
    */
    @Test
    public void formHeaderTest() throws InterruptedException {
        AbstractClass.clickBtn(buttonHeader, driver);
        Thread.sleep(500L);
        Assert.assertNotNull(userForm2);
        Assert.assertNotNull(telephone2);
        Assert.assertNotNull(personalDate2);
        Assert.assertNotNull(button2);

    }


}
