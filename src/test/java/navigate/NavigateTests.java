package navigate;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.QuestionPage;

public class NavigateTests extends BaseTests {
    @Test
    public void testSuccessfullyNavigate(){
        homePage.clickLanguageButton();
        homePage.setUsername("FarahTest4");
        homePage.setPassword("FarahTest4@123");
        QuestionPage questionPage = homePage.clickLoginButton().clcikQuestionDataButton().clickAddQuestionButton();
        questionPage.clickRequesthMethod();
        questionPage.clickRequesterName();
        questionPage.clickOrganization();
        questionPage.clickDepartment();
        questionPage.clickClassification();
        questionPage.clickChooseDrug();
        questionPage.setQuestionTitle("Dosage");
        questionPage.setQuestion("What is the correct dosage");
        questionPage.clickButton();


    }
}
