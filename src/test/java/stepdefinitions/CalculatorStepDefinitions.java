package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CalculatorStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver theMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("I open the Calculator application")
    public void iOpenTheCalculatorApplication() {
        theActorCalled("Actor")
                .can(BrowseTheWeb.with(theMobileDevice));
    }

//    @Before
//    public void initialConfigurationDektop() {
//        OnStage.setTheStage(new OnlineCast());
//    }
//
//    @After
//    public static void CloseDriver() throws IOException, InterruptedException {
//        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
//        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
//    }

//    @Given("^I enter to ToolsQA page$")
//    public void iEnterToEvalartTest() {
//
//    }

//    @Given("^I login with my user already created$")
//    public void iLoginWithMyUserAlreadyCreated(DataTable dataTable) {
//
//    }

    @Then("^only the book is are register$")
    public void onlyTheBookIsAreRegister() {

    }
}
