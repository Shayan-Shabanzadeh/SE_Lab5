package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SquareStepDefs {
    private Calculator calculator;

    private int a;
    private int b;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) and (\\d+) for sqrt$")
    public void twoInputValuesAnd(int args1, int args2) {
        a = args1;
        b = args2;
    }

    @When("^I calculate the square root of \\(a / b\\)$")
    public void iCalculateSquareRoot() {
        this.result = calculator.square(a, b);
    }

    @Then("^I expect the result for square (-?\\d+\\.?\\d*)$")
    public void iExpectTheResult(double expected) {
        Assert.assertEquals(expected, result, 0.001);
    }

}