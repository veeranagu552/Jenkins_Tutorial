package dataprovider;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;
import java.io.IOException;

public class DataProviderClass {
    @DataProvider(name = "testData")
    public static Object[][] getTestData() throws IOException {
        return ExcelUtil.getExcelData("Sheet1");
    }
}