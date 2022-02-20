package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageElementsHome {
    static WebDriver driver = null;


//    @FindBy(xpath = "//*[@id='pum_popup_title_760']")
//    protected WebElement confirmationSignature ;

    public PageElementsHome(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "pum_popup_title_760")
    private static WebElement confirmationSignature;

    //Общий класс для статичной формы сверху на главной странице
    static final String classNameForm = "wpcf7-f47-o1";
    @FindBys({
            @FindBy(id = classNameForm),
            @FindBy(name = "name-form")
    })
    private static WebElement fieldNameHead;

    @FindBys({
            @FindBy(id = classNameForm),
            @FindBy(name = "tel-form")
    })
    private static WebElement fieldTelephoneHead;

    @FindBys({
            @FindBy(id = classNameForm),
            @FindBy(className = "check-label")
    })
    private static WebElement checkPersonalDateHead;


    @FindBys({
            @FindBy(id = classNameForm),
            @FindBy(xpath = "//*[contains(@type, 'submit')]")
    })
    private static WebElement confirmationButtonHead;



    //forms
    //--кнопки "заказать обратный звонок"

    @FindBy(xpath = "//a[contains(@class, 'btn-calc popup')]")
    private static WebElement requestCallButton;

    @FindBy(xpath = "//a[contains(@class, 'head-btn popup')]")
    private static WebElement confirmationButtonHeader;


    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap name-form')]/input")
    private static WebElement fieldNameOnFormRequest;
    //--Ввод телефона
    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap tel-form')]/input")
    private static WebElement fieldTelephoneOnFormRequest;

    //-- соглашение на обработку персональных данных
    @FindBy(xpath = "//*[contains(@class, 'check-label')]")
    private static WebElement checkMarkPersonalDateOnFormRequest;

    // кнопка вызова-подтверждения
    @FindBy(xpath = "//*[@id='wpcf7-f47-o3']//*[@type='submit']")
    private static WebElement confirmationButtonOnFormRequest;


    //***********************
    public static WebElement getFieldNameHead() {
        return fieldNameHead;
    }

    public static WebElement getFieldTelephoneHead() {
        return fieldTelephoneHead;
    }

    public static WebElement getCheckPersonalDateHead() {
        return checkPersonalDateHead;
    }

    public static WebElement getConfirmationButtonHead() {
        return confirmationButtonHead;
    }

    public static WebElement getConfirmationSignature() {
        return confirmationSignature;
    }

    public static WebElement getRequestCallButton() {
        return requestCallButton;
    }


    public static WebElement getFieldNameOnFormRequest() {
        return fieldNameOnFormRequest;
    }


    public static WebElement getFieldTelephoneOnFormRequest() {
        return fieldTelephoneOnFormRequest;
    }


    public static WebElement getCheckMarkPersonalDateOnFormRequest() {
        return checkMarkPersonalDateOnFormRequest;
    }

    public static WebElement getConfirmationButtonOnFormRequest() {
        return confirmationButtonOnFormRequest;
    }

    public static void clickConfirmationButtonHeader() {
        confirmationButtonHeader.click();
    }


}
