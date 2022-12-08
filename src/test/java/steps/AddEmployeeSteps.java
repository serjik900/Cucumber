package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }
     @When("user clicks on employee button")
    public void user_clicks_on_employee_button() {
         WebElement addEmpBtn=driver.findElement(By.id("menu_pim_addEmployee"));
         addEmpBtn.click();
    }
    @When("user enter first name and lastname")
    public void user_enter_first_name_and_lastname() {
       WebElement firstName=driver.findElement(By.id("firstName"));
       firstName.sendKeys("Joe");
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Biden");

    }
    @When("user clicks on save buttom")
    public void user_clicks_on_save_buttom() {
      WebElement saveBtn= driver.findElement(By.id("btnSave"));
      saveBtn.click();
    }
    @Then("emploee added seccessfully")
    public void emploee_added_seccessfully() {
        System.out.println("Employee added");
    }
}
