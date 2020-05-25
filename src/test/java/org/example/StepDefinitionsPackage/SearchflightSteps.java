package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.PageObjectPackage.Searchflightpage;

public class SearchflightSteps {
    Searchflightpage searchflightpage = new Searchflightpage();

    @Given("^User is on homepage of Southalltravel$")
    public void user_is_on_homepage_of_Southalltravel() throws Throwable {
        Thread.sleep(3000);
        searchflightpage.urlAssertion();        //Assertion with if else concept to print out statement
    }

    @When("^User selects the airport in depart from box$")
    public void user_selects_the_airport_in_depart_from_box() throws Throwable {
    Thread.sleep(1000);
    searchflightpage.depAutoCompMethod();           //used AutocompleteDropdown
    }

    @When("^User selects the airport in Destination box$")
    public void user_selects_the_airport_in_Destination_box() throws Throwable {
        Thread.sleep(1000);
       searchflightpage.destinationAutoMethod();        //used autocomplete dropdown
    }

    @When("^User selects (\\d+)th May in departing calender$")
    public void user_selects_th_May_in_departing_calender(int arg1) throws Throwable {
        Thread.sleep(2000);
        searchflightpage.dapartingCalenderMethod();        //used List method
    }

    @When("^User selects (\\d+)th June in returning calender$")
    public void user_selects_th_June_in_returning_calender(int arg1) throws Throwable {
        Thread.sleep(2000);
        searchflightpage.returningCalenderMethod();         //used List method
    }

    @When("^User selects (\\d+) in adult box$")
    public void user_selects_in_adult_box(int arg1) throws Throwable {
        Thread.sleep(2000);
        searchflightpage.adultSelectClassMethod();          //used Select class
    }

    @When("^User selects Air India in Airline box$")
    public void user_selects_Air_India_in_Airline_box() throws Throwable {
        Thread.sleep(2000);
        searchflightpage.airlineSelectClassMethod();        //used Select class
    }

    @And("^User clicks on Search button$")
    public void userClicksOnSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        searchflightpage.searchBoxMethod();             //click on search
    }

    @Then("^User should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
    Thread.sleep(1000);
    searchflightpage.screenshotMethod();            //Taking screenshot of result page
    }
}
