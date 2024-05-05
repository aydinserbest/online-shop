package ecommerce.stepdefinitions;

import ecommerce.domain.Section;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefinitions {

    @When("she navigates to the {} section")
    public void she_navigates_to_the_all_section(Section section) {


    }
    @Then("she should be shown the {} page")
    public void she_should_be_shown_the_search_apparel_page() {
    }
}
