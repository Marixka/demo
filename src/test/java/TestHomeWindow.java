import Pages.PageElementsHome;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Pages.PageElementsHome.*;

public class TestHomeWindow extends BaseClass {
    static WebDriver driverHome = getWebDriver();

    static PageElementsHome pageHome = PageFactory.initElements(driverHome, PageElementsHome.class);


    @Before
    public void setup() {
        //todo необходимо сделать тесты независимые друг от друга
        //получение ссылки на страницу входа из файла настроек
        driverHome.get(Veribles.getWindowsPageName());
        FindElements(pageHome);

    }

    @AfterClass
    public static void close() {
        driverHome.close();
    }


    /*
     * Проверка, что окно заказа доступно на главной странице ниже шапки
     * окно статичное
     * заявка отправляется
     */
    @Test
    public void testRequestOnHeadFormSpecial() {

        getFieldNameHead().sendKeys(Veribles.getNameOne());
        getFieldTelephoneHead().sendKeys(Veribles.getTelephone());
        getCheckPersonalDateHead().click();
        getConfirmationButtonHead().click();

        waitElements(getConfirmationSignature());
        Assert.assertEquals("Спасибо, ваша заявка принята!", getConfirmationSignature().getText());
        getButtonClose().click();
    }

    /*
     * Проверка, что окно заказа доступно и заявка отправляется
     * Вызов замерщика в середине странице
     */
    @Test
    public void testRequestOnWindowHome() throws InterruptedException {

        click(getRequestCallButton());
        getFieldNameOnFormRequest().sendKeys(Veribles.getNameTwo());
        getFieldTelephoneOnFormRequest().sendKeys(Veribles.getTelephone());
        getCheckMarkPersonalDateOnFormRequest().click();
        getConfirmationButtonOnFormRequest().click();

        waitElements(getConfirmationSignature()); // ожидаем элемент
        Assert.assertEquals("Спасибо, ваша заявка принята!", getConfirmationSignature().getText());
        getButtonClose().click();
    }

    /*
     * Проверка, что окно заказа доступно
     * в шапке на главной странице
     * заявка на почту не отправляется
     */
    @Test
    public void testRequestOnHeadWindowHome() {
        getRequestButtonHeader().click();
        waitElements(getFieldNameOnFormRequest());
        Assert.assertNotNull(getFieldNameOnFormRequest());
        Assert.assertNotNull(getFieldTelephoneOnFormRequest());
        Assert.assertNotNull(getCheckMarkPersonalDateOnFormRequest());
        Assert.assertNotNull(getConfirmationButtonOnFormRequest());
        getButtonCloseModalWindowRequest().click();

    }


}
