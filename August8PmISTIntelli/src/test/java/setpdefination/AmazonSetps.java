package setpdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSetps {
    WebDriver derver;
    WebElement categoryElement;

    @Given("user navigate to Amazon HomePage")
    public void homePage(){
        derver = new ChromeDriver();
     derver.get("https://www.amazon.in/");

    }

    @When("user enter the product name {string}")
    public void userEnterTheProductName(String keyboard) {
        derver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyboard);

    }

    @And("user clicks the search icon")
    public void userClicksTheSearchIcon() {
        
    }

    @Then("user validate the title of the page")
    public void userValidateTheTitleOfThePage() {
        
    }

    @And("user validate the search results")
    public void userValidateTheSearchResults() {
    }

    @When("user select the dropdown value from category dropdown")
    public void handleDropdown() {
     // WebElement  categoryElement = derver.findElement(By.id("searchDropdownBox"));
      categoryElement = derver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']/child::div/child::select"));
        Select category = new Select(categoryElement);
        //category.selectByIndex(10);
        //category.selectByVisibleText("baby");
        category.selectByValue("search-alias=toys"); //element

        
    }

    @And("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {
    int categorySize = categoryElement.findElements(By.tagName("option")).size();
     for (int i=0 ; i<categorySize; i++) {
         String value = categoryElement.findElements(By.tagName("option")).get(i).getText();
         System.out.println(value);
     }
    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {
    }
}
