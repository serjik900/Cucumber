package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ChangeEmpContactsPage extends CommonMethods {

    @FindBy(id="btnSave")
    public WebElement EditAndSaveBtn;

    @FindBy(id="contact_street1")
    public WebElement FirstAddressStField;

    @FindBy(id="contact_street2")
    public WebElement SecondAddressStField;

    @FindBy(id="contact_city")
    public WebElement CityField;

    @FindBy(id="contact_province")
    public WebElement StateField;

    @FindBy(id="contact_emp_zipcode")
    public WebElement ZipField;

    @FindBy(id="contact_country")
    public WebElement CountryField;

    @FindBy(id="contact_emp_hm_telephone")
    public WebElement HomeTelephoneField;

    @FindBy(id="contact_emp_mobile")
    public WebElement MobilePhoneField;

    @FindBy(id="contact_emp_work_telephone")
    public WebElement WorkTelephoneField;

    @FindBy(id="contact_emp_work_email")
    public WebElement WorkEmailField;

    @FindBy(id="contact_emp_oth_email")
    public WebElement OtherEmailField;

    public ChangeEmpContactsPage(){
        PageFactory.initElements(driver,this);
    }

}
