package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.EriBankDatos;
import co.com.choucair.certification.tasks.Login;
import co.com.choucair.certification.tasks.Pay;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class EriBankStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^Laura login with username and password$")
    public void lauraLoginWithUsernameAndPassword(List<EriBankDatos> eriBankDatosList){
       OnStage.theActorCalled("laura").attemptsTo(Login.toThe(eriBankDatosList));
    }
    @Then("^you can see your balance$")
    public void youCanSeeYourBalance()  {
    }
    @Then("^you can make payment$")
    public void you_can_make_payment() {
        OnStage.theActorCalled("laura").attemptsTo(Pay.money());
    }
}
