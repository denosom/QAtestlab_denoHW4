package myprojects.automation.assignment4.tests;

import myprojects.automation.assignment4.BaseTest;
import myprojects.automation.assignment4.GeneralActions;
import myprojects.automation.assignment4.utils.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static myprojects.automation.assignment4.utils.Properties.getBaseAdminUrl;
import static myprojects.automation.assignment4.utils.Properties.getBaseUrl;


public class CreateProductTest extends BaseTest {

@Parameters ({"login","password"})
    @Test
    public void createNewProduct(String login, String password) {

        // TODO implement test for product creation
        driver.get(getBaseAdminUrl());

        actions.login(login, password);
    System.out.println("----login complete----");
    }

           //    actions.login(login, password);

        // ...


    // TODO implement logic to check product visibility on website
}
