package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddQuestionPage {
    private  WebDriver driver;
    public AddQuestionPage(WebDriver driver){
        this.driver=driver;
    }
    private By addQuestionButton = By.xpath("//div[contains(@class,'row d-flex justify-center')]//div[1]//div[1]");


    public QuestionPage clickAddQuestionButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(addQuestionButton));
        driver.findElement(addQuestionButton).click();
        return new QuestionPage(driver);
    }
}
