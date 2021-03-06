public class FacebookMainPage {


    public static final String PAGE_TITLE = "Facebook - Log In or Sign Up";
    public static final String PAGE_URL = "http://www.facebook.com";


    @FindBy(id = "email") WebElement field_EmailLogin;
    @FindBy(id = "pass") WebElement field_PasswordLogin;


    WebDriver driver;


    public FacebookMainPage(WebDriver driver){
        this.driver = driver;
    }


    public void setText_EmailLogin(String text){
      field_EmailLogin.sendKeys(text);
        Assert.assertEquals(field_EmailLogin.getAttribute("value"), text);
    }

    public void setText_PasswordLogin(String text){
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_PasswordLogin.getAttribute("value"), text);
    }



}