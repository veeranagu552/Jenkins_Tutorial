package tests;
import org.testng.annotations.Test;

public class SearchTest {
    @Test(retryAnalyzer = retry.RetryAnalyzer.class)
    public void searchTest() {
        System.out.println("Executing search test");
    }
}