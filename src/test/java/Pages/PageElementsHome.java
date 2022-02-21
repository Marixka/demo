package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class PageElementsHome {




    private static final String classFormOnWindowHome = "form-main";

    public static String getXpathRequestFieldNameOnFormWindows() {
        return "//*[contains(@class, " + classFormOnWindowHome + ")]" +
                "//*[contains(@name, 'name-form')]";
    }

    public static String getXpathRequestFieldTelephoneOnFormWindows() {
        return "//*[contains(@class, " + classFormOnWindowHome + ")]" +
                "//*[contains(@name, 'tel-form')]";
    }

    public static String getXpathCheckMarkPDOnFormWindows() {
        return "//*[contains(@class, " + classFormOnWindowHome + ")]" +
                "//*[contains(@class, 'heck-label')]";
    }

    public static String getButtonConfirmOnFormWindows() {
        return "//*[contains(@class, " + classFormOnWindowHome + ")]" +
                "//*[contains(@type, 'submit')]";
    }

    public static String getButtonCloseSuccessfulRequest() {
        return "//*[contains(@class, 'pum-close popmake-close')]";
    }

    //*********
    private static final String classModelFormRequest = "mfp-content";

    public static String getButtonRequestOnHead() {
        return "//*[contains(@class, 'head-btn popup')]";
    }

    public static String getFieldNameOnModelFormRequest() {
        return "//*[contains(@class, " + classModelFormRequest + ")]" +
                "//*[contains(@name, 'name-form')]";
    }

    public static String getFieldTelOnModelFormRequest() {
        return "//*[contains(@class, " + classModelFormRequest + ")]" +
                "//*[contains(@name, 'tel-form')]";
    }

    public static String geCheckMarkOnModelFormRequest() {
        return "//*[contains(@class, " + classModelFormRequest + ")]" +
                "//*[contains(@class, 'check-label')]";
    }

    public static String getButtonConfirmOnModelFormRequest() {
        return "//*[contains(@class, " + classModelFormRequest + ")]" +
                "//*[contains(@type, 'submit')]";
    }
    public static String getButtonsCloseOnModelWindow() {
        return "//*[contains(@class, " + classModelFormRequest + ")]" +
         "//*[contains(@title, 'Close (Esc)')]";
    }



    //****

    public static String getButtonsRequestOnWindowHome() {
        return "//*[contains(@class, 'btn-calc popup')]";
    }







//
//
//
//
//
//    //    @FindBy(how = How.ID, using = "pum_popup_title_760")
//    private static String confirmationSignature;
//
//
//
//    //Общий класс для статичной формы сверху на главной странице
//    static final String idFormRequest = "wpcf7-f47-o1";
//    @FindBys({
//            @FindBy(id = idFormRequest),
//            @FindBy(xpath = "//*[contains(@name, 'name-form')]")
//    })
//    private static WebElement fieldNameHead;
//
//    @FindBys({
//            @FindBy(id = idFormRequest),
//            @FindBy(name = "tel-form")
//    })
//    private static WebElement fieldTelephoneHead;
//
//    @FindBys({
//            @FindBy(id = idFormRequest),
//            @FindBy(className = "check-label")
//    })
//    private static WebElement checkPersonalDateHead;
//
//
//    @FindBys({
//            @FindBy(id = idFormRequest),
//            @FindBy(xpath = "//*[contains(@type, 'submit')]")
//    })
//    private static WebElement confirmationButtonHead;
//
//
//    //forms
//    //--кнопки "заказать обратный звонок"
//
//    @FindBy(xpath = "//a[contains(@class, 'btn-calc popup')]")
//    private static WebElement requestCallButton;
//
//    @FindBy(xpath = "//a[contains(@class, 'head-btn popup')]")
//    private static WebElement requestButtonHeader;
//
//
//    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap name-form')]/input")
//    private static WebElement fieldNameOnFormRequest;
//    //--Ввод телефона
//    @FindBy(xpath = "//*[contains(@class, 'wpcf7-form-control-wrap tel-form')]/input")
//    private static WebElement fieldTelephoneOnFormRequest;
//
//    @FindBys({
//            @FindBy(id = "popmake-760"),
//            @FindBy(name = "pum-close popmake-close")
//    })
//    private static WebElement buttonClose;
//
//    //-- соглашение на обработку персональных данных
//    @FindBy(xpath = "//*[contains(@class, 'check-label')]")
//    private static WebElement checkMarkPersonalDateOnFormRequest;
//
//    // кнопка вызова-подтверждения
//    @FindBy(xpath = "//*[@id='wpcf7-f47-o3']//*[@type='submit']")
//    private static WebElement confirmationButtonOnFormRequest;
//
//    @FindBy(className = "mfp-close")
//    private static WebElement buttonCloseModalWindowRequest;
//
//
//
//    //***********************
//    public static WebElement getButtonCloseModalWindowRequest() {
//        return buttonCloseModalWindowRequest;
//    }
//
//    public static WebElement getFieldNameHead() {
//        return fieldNameHead;
//    }
//
//    public static WebElement getFieldTelephoneHead() {
//        return fieldTelephoneHead;
//    }
//
//    public static WebElement getCheckPersonalDateHead() {
//        return checkPersonalDateHead;
//    }
//
//    public static WebElement getButtonClose() {
//        return buttonClose;
//    }
//
//    public static WebElement getConfirmationButtonHead() {
//        return confirmationButtonHead;
//    }
//
////    public static WebElement getConfirmationSignature() {
////        return confirmationSignature;
////    }
//
//    public static WebElement getRequestCallButton() {
//        return requestCallButton;
//    }
//
//
//    public static WebElement getFieldNameOnFormRequest() {
//        return fieldNameOnFormRequest;
//    }
//
//
//    public static WebElement getFieldTelephoneOnFormRequest() {
//        return fieldTelephoneOnFormRequest;
//    }
//
//
//    public static WebElement getCheckMarkPersonalDateOnFormRequest() {
//        return checkMarkPersonalDateOnFormRequest;
//    }
//
//    public static WebElement getConfirmationButtonOnFormRequest() {
//        return confirmationButtonOnFormRequest;
//    }
//
//    public static WebElement getRequestButtonHeader() {
//        return requestButtonHeader;
//    }


}
