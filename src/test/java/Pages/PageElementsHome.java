package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    protected static WebElement confirmationSignature;


    //form static
    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[1]/span[1]/input")
    protected static WebElement fieldNameHead;


    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[1]/span[2]/input")
    protected static WebElement fieldTelephoneHead;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[2]/label/span[2]")
    protected static WebElement checkPersonalDateHead;

    @FindBy(xpath = "//*[@id='wpcf7-f47-o1']/form/p[2]/input")
    protected static WebElement confirmationButtonHead;


    //forms
    //--кнопки "заказать обратный звонок"
    @FindBy(xpath = "//a[contains(@class, 'btn-calc popup')]")
    protected static WebElement requestCallButton;

    @FindBy(xpath = "//a[contains(@class, 'head-btn popup')]")
    protected static WebElement confirmationButtonHeader;


    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap name-form')]/input")
    protected static WebElement fieldNameOnFormRequest;
    //--Ввод телефона
    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap tel-form')]/input")
    protected static WebElement fieldTelephoneOnFormRequest;
    //-- соглашение на обработку персональных данных
    @FindBy(xpath = "//*[contains(@class, 'check-label')]")
    protected static WebElement checkMarkPersonalDateOnFormRequest;
    // кнопка вызова-подтверждения
    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control wpcf7-submit form-btn send-form')]")
    protected static WebElement confirmationButtonOnFormRequest;


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
