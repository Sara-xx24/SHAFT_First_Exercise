import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AddToCart {
    //Initiate the driver

    private SHAFT.GUI.WebDriver driver;
  //  private String URl = "http://www.automationpractice.pl/index.php";

    //Constructor
    public AddToCart (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

  //  public AddToCart NavigateToUrl () {
      //  driver.browser().navigateToURL(URl);
      //  return this;}

    //Element Locators
    private By sign_inTabButton = By.xpath("//a[@class=\"login\"]");
    private By emailAddressField = By.xpath("//input[@name=\"email_create\"]");
    private By createAccountButton = By.xpath("//i[@class=\"icon-user left\"]");
    private By maleGenderButton = By.xpath("//input[@id=\"id_gender1\"]");
    private By femaleGenderButton = By.xpath("//input[@id=\"id_gender2\"]");
    private By firstNameField = By.xpath("//input[@onkeyup=\"$('#firstname').val(this.value);\"]");
    private By lastNameField = By.xpath("//input[@onkeyup=\"$('#lastname').val(this.value);\"]");
    private By passwordField = By.xpath("//input[@type=\"password\"]");
    private By checkboxNewsletter = By.xpath("//input[@name=\"newsletter\"]");
    private By registerButton = By.xpath("//button[@name=\"submitAccount\"]");
    private By searchField = By.xpath("//input[@class=\"search_query form-control ac_input\"]");
    private By searchButton = By.xpath("//button[@name=\"submit_search\"]");
    private By moreButton = By.xpath("//a[@class=\"button lnk_view btn btn-default\"]");
    private By whiteButton = By.xpath("//a[@id=\"color_8\"]");
    private By addtocartButton = By.xpath("//button[@name=\"Submit\"]");
    private By productName = By.xpath("//span[@id=\"layer_cart_product_attributes\"]");
    private By productQuantity = By.xpath("//span[@id=\"layer_cart_product_quantity\"]");
    private By productTotalPrice = By.xpath("//span[@id=\"layer_cart_product_price\"]");

    //Actions

    public AddToCart navigateToUrl (String URl){
        driver.browser().navigateToURL(URl);
      return this;
    }
    public AddToCart clickSigninTab(){
        driver.element().click(sign_inTabButton);
        return this;
    }
    public AddToCart fillEmailField(String email) {
        driver.element().type(emailAddressField,email);
                return this;
    }
    public AddToCart clickCreateAccount(){
        driver.element().click(createAccountButton);
        return this;
    }
    public AddToCart clickMaleGender() {
      driver.element().click(maleGenderButton);
      return this;
    }
    public AddToCart clickFemaleGender() {
        driver.element().click(femaleGenderButton);
        return this;
    }
    public AddToCart typeFirstName(String FirstName){
        driver.element().type(firstNameField,FirstName);
        return this;
    }
    public AddToCart typeLastName(String LastName){
        driver.element().type(lastNameField,LastName);
        return this;
    }
    public AddToCart typePassword(String Password){
        driver.element().type(passwordField,Password);
        return this;
    }
    public AddToCart clickOncheckBox(){
        driver.element().click(checkboxNewsletter);
        return this;
    }
    public AddToCart clickRegister(){
        driver.element().click(registerButton);
        return this;
    }
    public AddToCart clickOnsearchBar(){
        driver.element().click(searchField);
        return this;
    }
  public AddToCart typeinSearchBar(String Product){
       driver.element().type(searchField,Product);
       return this;
    }
   public AddToCart clickonSearchButton(){
       driver.element().click(searchButton);
       return this;
   }
    public AddToCart clickOnMoreButton(){
       driver.element().click(moreButton);
       return this;
    }
    public AddToCart clickonWhite(){
       driver.element().click(whiteButton);
      return this;
   }
   public AddToCart clickAddtocart(){
        driver.element().click(addtocartButton);
       return this;
    }

//Validations
   public AddToCart validateProductName (String Blouse) {
       driver.verifyThat().element(productName).text().isEqualTo(Blouse).perform();
      return this;
   }

   public AddToCart validateProductQuantity (String quantity){
      driver.verifyThat().element(productQuantity).text().isEqualTo(quantity).perform();
    return this;
    }

  public AddToCart validatePrice(String $27){
        driver.assertThat().element(productTotalPrice).text().isEqualTo($27).perform();
        return this;
  }

 // }


}




