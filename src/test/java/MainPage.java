import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{
    private final String SITE_NAME = "Youtube";
    private final String VALID_URL = "www.youtube.com";
    @FindBy(xpath = "//*[@id=\"siteName\"]")
    private WebElement siteName;

    @FindBy(xpath = "//*[@id=\"urlName\"]")
    private WebElement urlBar;

    @FindBy(xpath = "//*[@id=\"myForm\"]/button")
    private WebElement submitButton;

    public void populateSiteName() {
        this.siteName.sendKeys(SITE_NAME);
    }
    public void populateUrlBar() {
        this.urlBar.sendKeys(VALID_URL);
    }
    public void searchItemUsingButton() {
        this.submitButton.click();
    }
    public MainPage(WebDriver driver) {
        super(driver);
    }
}
