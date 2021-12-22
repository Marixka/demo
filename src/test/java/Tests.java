import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap name-form')]")
    private WebElement userMenu;

    public  Tests(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @Before
    public void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ReadVariable.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ReadVariable.getProperty("windowsPage"));
    }

    @Test
    public void loginTest() {
        //значение login/password берутся из файла настроек по аналогии с chromedriver
//и loginpage
//вводим логин

//        inputName(driver.findElement(By.xpath("//*[@id='wpcf7-f47-o1']/form/p[1]/span[1]/input")),
//                ReadVariable.getProperty("name"));

        inputName(name, ReadVariable.getProperty("name"));
        inputName(telephone, ReadVariable.getProperty("telephone"));

//        inputName(driver.findElement(By.xpath("//*[@id='wpcf7-f47-o1']/form/p[1]/span[2]/input")),
//                ReadVariable.getProperty("telephone"));

        //нажимаем кнопку входа
//        clickLoginBtn(driver.findElement(By.xpath("//*[@id='wpcf7-f47-o1']/form/p[2]/label/span[2]")));
        clickLoginBtn(personalDate);
        //вводим пароль
    //    inputTelephone(ReadVariable.getProperty("telephone"));

        //нажимаем кнопку входа
//        clickLoginBtn(driver.findElement(By.xpath("//*[@id='wpcf7-f47-o1']/form/p[2]/input")));
        clickLoginBtn(button);
        //нажимаем кнопку входа
      //  clickLoginBtn();
        //получаем отображаемый логин

                WebElement spasibo = driver.findElement(By.xpath("//span[contains(text(), 'Спасибо, ваша заявка принята!')]"));
        //и сравниваем его с логином из файла настроек
        Assert.assertNotNull(spasibo); }


    public void inputName(WebElement el, String login) {
        el.sendKeys(login); }

    public void clickLoginBtn(WebElement el) {
        el.click(); }

}
