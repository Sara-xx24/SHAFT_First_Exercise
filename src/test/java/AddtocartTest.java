import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtocartTest {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;

    // JSON Reader Initialization
    @BeforeClass
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("src/test/resources/testData/Data.json");
    }

    @BeforeMethod
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    // TestCase1
    @Test
    @Description("Validate the Add to Cart functionality.")
    public void addToCartValidation(){
        AddToCart addToCart = new AddToCart(driver)
                .navigateToUrl(testData.getTestData("user.url"))
                .clickSigninTab()
                .fillEmailField(testData.getTestData("user.email"))
                .clickCreateAccount()
                .clickFemaleGender()
                .typeFirstName(testData.getTestData("user.first"))
                .typeLastName(testData.getTestData("user.last"))
                .typePassword(testData.getTestData("user.password"))
                .clickOncheckBox()
                .clickRegister()
                .clickOnsearchBar()
                .typeinSearchBar(testData.getTestData("user.product"))
                .clickonSearchButton()
                .clickOnMoreButton()
                .clickonWhite()
                .clickAddtocart()
                .validateProductName(testData.getTestData("user.expected1"))
                .validateProductQuantity(testData.getTestData("user.expected2"))
                .validatePrice(testData.getTestData("user.expected3"));
    }

    @AfterMethod
    @Description("Close the browser after the test")
    public void tearDown(){
        driver.browser().closeCurrentWindow();
    }
}
