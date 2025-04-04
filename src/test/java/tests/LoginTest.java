package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import dataprovider.DataProviderClass;

@Listeners(listeners.TestListener.class)
public class LoginTest {
    @Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
    public void loginTest(String username, String password) {
        System.out.println("Executing login test with: " + username + " / " + password);
    }
}