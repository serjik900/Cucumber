package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class ChangeEmpContacts extends CommonMethods {
    @When("user clicks on desire contact")
    public void user_clicks_on_desire_contact() {
        click(dashboard.empListOption);


        click(empContacts.FirstEmpFromList);


    }

    @Then("contact details")
    public void contact_details() {
click(empContacts.ContactDetailsBtn);
    }

    @Then("user click edit button")
    public void user_click_edit_button() {
click(empContacts.EditAndSaveBtn);

    }

    @Then("user verify that Address Street one textbox is displayed and user can enter values")
    public void user_verify_that_address_street_one_textbox_is_displayed_and_user_can_enter_values() {
        boolean tAdOne=empContacts.FirstAddressStField.isDisplayed();
        if(tAdOne){
            System.out.println("Address Street one textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }

sendText(empContacts.FirstAddressStField,"FirstAddressBoxCheck");

    }

    @Then("Address Street two textbox is displayed and user can enter values there")
    public void address_street_two_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tAdTwo=empContacts.SecondAddressStField.isDisplayed();
        if(tAdTwo){
            System.out.println("Address Street two textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.SecondAddressStField,"SecondAddressBoxCheck");

    }

    @Then("City textbox is displayed and user can enter values there")
    public void city_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tCity=empContacts.CityField.isDisplayed();
        if(tCity){
            System.out.println("City textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.CityField,"CityFieldCheck");

    }

    @Then("State or Province textbox is displayed and user can enter values there")
    public void state_province_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tState=empContacts.StateField.isDisplayed();
        if(tState){
            System.out.println("State or Province textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.StateField,"StateFieldCheck");
    }

    @Then("Zip or Postal Code textbox is displayed and user can enter values there")
    public void zip_postal_code_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tZip=empContacts.ZipField.isDisplayed();
        if(tZip){
            System.out.println("Zip or Postal Code textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.ZipField,"11111");
    }

    @Then("Country textbox is displayed and user can enter values there")
    public void country_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tCo=empContacts.CountryField.isDisplayed();
        if(tCo){
            System.out.println("Country textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
        Select select=new Select(empContacts.CountryField);
        select.selectByVisibleText("United States");

    }

    @Then("Home Phone textbox is displayed and user can enter values there")
    public void home_phone_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tHomeT=empContacts.HomeTelephoneField.isDisplayed();
        if(tHomeT){
            System.out.println("Home Phone textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.HomeTelephoneField,"2222222222");
    }

    @Then("Mobile Phone textbox is displayed and user can enter values there")
    public void mobile_phone_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tMobT=empContacts.MobilePhoneField.isDisplayed();
        if(tMobT){
            System.out.println("Mobile Phone textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.MobilePhoneField,"0000000000");
    }

    @Then("Work Phone textbox is displayed and user can enter values there")
    public void work_phone_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tWorkT=empContacts.WorkTelephoneField.isDisplayed();
        if(tWorkT){
            System.out.println("Work Phone textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.WorkTelephoneField,"333333333");
    }

    @Then("Work Email textbox is displayed and user can enter values there")
    public void work_email_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tWorkE=empContacts.WorkEmailField.isDisplayed();
        if(tWorkE){
            System.out.println("Work Email textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.WorkEmailField,"test@gmail.com");
    }

    @Then("Other Email textbox is displayed and user can enter values there")
    public void other_email_textbox_is_displayed_and_user_can_enter_values_there() {
        boolean tOtherEmail=empContacts.OtherEmailField.isDisplayed();
        if(tOtherEmail){
            System.out.println("Other Email textbox is displayed");
        }else{
            System.out.println("Element does not displayed");
        }
sendText(empContacts.OtherEmailField,"testOtherEmail@gmail.com");
    }
    @Then("user able to save the changes")
    public void user_able_to_save_the_changes() {
        click(empContacts.EditAndSaveBtn);
    }

}
