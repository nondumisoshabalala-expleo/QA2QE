package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.productlistPageObject;

public class productliststepdefinition {

    WebDriver driver;
    //productlistPageObject productlist;

    @Given("I am a visitor")
    public void i_am_a_visitor() {

        System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\drivers\\geckodriver.exe");
        //driver  = new FirefoxDriver();
        driver = new FirefoxDriver();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //Open Luma webpage
        driver.get("https://magento.abox.co.za");

        //Assert to verify if user is on the correct page
        String expectedTitle = "Home Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        //Explicit wait
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
    }

    @When("I navigate to the woman tops product list")
    public void i_navigate_to_the_woman_tops_product_list() {

        //Open the link to the women tops page
        driver.get("https://magento.abox.co.za/index.php/women/tops-women.html");

        //Hover over Women dropdown

        //productlistPageObject productlist = PageFactory.initElements(driver,productlistPageObject.class);

        /*WebDriverWait wait1 = new WebDriverWait(driver, 30);
        productlistPageObject  productlist = new productlistPageObject();
        productlist.hoverWomenDropdown();*/

    }

    @Then("the womans top product list will be displayed")
    public void the_womans_top_product_list_will_be_displayed() {

        /*WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        Assert.assertTrue("Does not contain the text 'Tops'", bodyText.contains("Tops'"));*/

        //Assert to verify that user is on the correct page. Verify by Title since it's the only unique change when women tops product list opens
        String expectedTitle = "Tops - Women";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        //Negative test. Commented out. Un-comment to test.
        /*String negativeexpectedTitle = "Tops - Womens";
        String negativeactualTitle = driver.getTitle();
        Assert.assertEquals(negativeactualTitle,negativeexpectedTitle);*/

        //Close Luma website
        driver.close();

    }
}
