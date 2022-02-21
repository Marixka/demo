import Pages.PageElementsHome;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.*;
import org.openqa.selenium.By;

import java.util.Objects;

import static Pages.PageElementsHome.*;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class TestHomeWindow extends BaseClass {
  //  static WebDriver driverHome = getWebDriver();

  //  static PageElementsHome pageHome = PageFactory.initElements(driverHome, PageElementsHome.class);


    @Before
    public void setup() {

        open(Veribles.getWindowsPageName());
//        //получение ссылки на страницу входа из файла настроек
//        driverHome.get(Veribles.getWindowsPageName());
//        FindElements(pageHome);

    }




    /*
     * Проверка, что окно заказа доступно
     * в шапке на главной странице
     * заявка на почту не отправляем
     */
    @Test
    public void testRequestOnHeadWindowHome() {


        $(By.xpath(getButtonRequestOnHead())).click();
        $(By.xpath(getFieldNameOnModelFormRequest())).setValue(Veribles.getNameTwo());
        $(By.xpath(getFieldTelOnModelFormRequest())).setValue(Veribles.getTelephone());
        $(By.xpath(geCheckMarkOnModelFormRequest())).click();
        $(By.xpath(getButtonConfirmOnModelFormRequest()))
                .shouldBe(Condition.visible)
                .shouldHave(attribute("value","Вызвать замерщика"))
                .shouldHave(Condition.enabled);
        $(By.xpath(getButtonsCloseOnModelWindow())).click();





//        getFieldNameHead().sendKeys(Veribles.getNameOne());
//        getFieldTelephoneHead().sendKeys(Veribles.getTelephone());
//        getCheckPersonalDateHead().click();
//        getConfirmationButtonHead().click();
//
//        waitElements(getConfirmationSignature());
//        Assert.assertEquals("Спасибо, ваша заявка принята!", getConfirmationSignature().getText());
//        getButtonClose().click();
    }

    /*
     * Проверка, что на главной странице имеется две кнопки вызова замерщика
     * Проверяем все поля для каждого вызова
     * Заказ не отправляем
     */
    @Test
    public void testRequestOnWindowHome() throws InterruptedException {
        ElementsCollection list  =  $$(By.xpath(getButtonsRequestOnWindowHome()));
        assert list.size()==2;
        for (SelenideElement selenideElement : list) {
            selenideElement.click();
            $(By.xpath(getFieldNameOnModelFormRequest())).setValue(Veribles.getNameTwo());
            $(By.xpath(getFieldTelOnModelFormRequest())).setValue(Veribles.getTelephone());
            SelenideElement elCheckMark = $(By.xpath(geCheckMarkOnModelFormRequest()));
            if (!Objects.requireNonNull(elCheckMark.getAttribute("class")).contains("active")) {
                elCheckMark.click();
            }
            $(By.xpath(getButtonConfirmOnModelFormRequest()))
                    .shouldBe(Condition.visible)
                    .shouldHave(attribute("value","Вызвать замерщика"))
                    .shouldHave(Condition.enabled);
            $(By.xpath(getButtonsCloseOnModelWindow())).click();

        }


//
//        click(getRequestCallButton());
//        getFieldNameOnFormRequest().sendKeys(Veribles.getNameTwo());
//        getFieldTelephoneOnFormRequest().sendKeys(Veribles.getTelephone());
//        getCheckMarkPersonalDateOnFormRequest().click();
//        getConfirmationButtonOnFormRequest().click();
//
//        waitElements(getConfirmationSignature()); // ожидаем элемент
//        Assert.assertEquals("Спасибо, ваша заявка принята!", getConfirmationSignature().getText());
//        getButtonClose().click();
    }

    /*
     * Проверка, что окно заказа доступно на главной странице ниже шапки
     * окно статичное
     * заявка отправляется
     */
    @Test
    public void testRequestOnHeadFormSpecial () {

        $(By.xpath(getXpathRequestFieldNameOnFormWindows())).setValue(Veribles.getNameOne());
        $(By.xpath(getXpathRequestFieldTelephoneOnFormWindows())).setValue(Veribles.getTelephone());

        $(By.xpath(getXpathCheckMarkPDOnFormWindows())).click();
        $(By.xpath(getButtonConfirmOnFormWindows())).click();
        $(By.xpath(getButtonCloseSuccessfulRequest())).click();


//
//
//        getRequestButtonHeader().click();
//        waitElements(getFieldNameOnFormRequest());
//        Assert.assertNotNull(getFieldNameOnFormRequest());
//        Assert.assertNotNull(getFieldTelephoneOnFormRequest());
//        Assert.assertNotNull(getCheckMarkPersonalDateOnFormRequest());
//        Assert.assertNotNull(getConfirmationButtonOnFormRequest());
//        getButtonCloseModalWindowRequest().click();

    }


}
