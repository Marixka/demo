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

public class Tests {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), 'Спасибо, ваша заявка принята!')]")
    private WebElement windowFree;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[1]/span[1]/input")
    private WebElement name;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[1]/span[2]/input")
    private WebElement telephone;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[2]/label/span[2]")
    private WebElement personalDate;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[2]/input")
    private WebElement button;


    //form 2

    @FindBy(xpath = "//a[contains(@class, 'btn-calc popup')]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap name-form')]/input")
    private WebElement userForm2;

    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap tel-form')]/input")
    private WebElement telephone2;

    @FindBy(xpath = "//*[contains(@class, 'check-label')]")
    private WebElement personalDate2;

    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control wpcf7-submit form-btn send-form')]")
    private WebElement button2;

    //   public  Tests(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }


    @Before
    public void setup() {


        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ReadVariable.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек

    }

    @After
    public void close() {
        driver.close();
    }

    @Test
    public void form1() throws InterruptedException {
        driver.get(ReadVariable.getProperty("windowsPage"));
        PageFactory.initElements(driver, this);



        inputName(name, ReadVariable.getProperty("name"));
        inputName(telephone, ReadVariable.getProperty("telephone"));
        clickLoginBtn(personalDate);
        clickLoginBtn(button);
        WebElement spasibo = driver.findElement(By.xpath("//*[@id='pum_popup_title_760']"));
        Thread.sleep(1000L);

        Assert.assertEquals("Спасибо, ваша заявка принята!", spasibo.getText());
    }

    @Test
    public void form2() throws InterruptedException {
        driver.get(ReadVariable.getProperty("windowsPage"));
        PageFactory.initElements(driver, this);

        clickLoginBtn(userMenu);
        Thread.sleep(500L);

        inputName(userForm2, ReadVariable.getProperty("name2"));
        inputName(telephone2, ReadVariable.getProperty("telephone"));
        clickLoginBtn(personalDate2);
        clickLoginBtn(button2);
        WebElement spasibo = driver.findElement(By.xpath("//*[@id='pum_popup_title_760']"));
        Thread.sleep(500L);

        Assert.assertEquals("Спасибо, ваша заявка принята!", spasibo.getText());
    }


    public void inputName(WebElement el, String login) {
        el.sendKeys(login);
    }

    public void clickLoginBtn(WebElement el) {
        try {
            el.click();
        } catch (Exception e) {
            new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
            el.click();
        }
    }

}
