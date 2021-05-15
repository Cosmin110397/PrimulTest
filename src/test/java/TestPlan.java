import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();
    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Search smth")
    public static void searchSomething() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteName();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "Search complete")
    public static void searchComplete() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteName();
        webForm.populateUrlBar();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "Search url")
    public static void searchUrl() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateUrlBar();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "Search without text")
    public static void searchWithoutText() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.searchItemUsingButton();
    }


    @AfterSuite public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
