package HSPC_CDS_Hook.stepsDef;

import com.codeborne.selenide.Selenide;
import Help.services.ui.models.HSPSLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HSPCStepsDef extends AbdtractStepsSCDSPDef {


    @Given("^I open HSPC Sendbox Page$")
    public void openHomePage() {
        hspcloginPage = Selenide.open("https://sandbox.hspconsortium.org", HSPSLoginPage.class);
    }

    @When("^Login in to HSPC wia email and password$")
    public void performLogin() {
        hcpsSandboxSelectionPage = hspcloginPage.login("Vladyslav.Seden@wolterskluwer.com", "om360557");
    }

    @When("^Select 'UpToDate Health pilot' sendbox$")
    public void selectSendbox() {
        hcpsSandboxSelectionPage.performSendboxSelection("UpToDate Health Pilot");

    }

    @Then("^Verify that footer contains elements:$")
    public void verifyThatFooterContainsElements() {

    }
}