package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SystemHomePage {
    private WebDriver driver;
    public SystemHomePage(WebDriver driver){
        this.driver=driver;
    }

    private By questionDataButton = By.xpath("//a[contains(@class,'v-card v-card--link v-sheet theme--light')]");

    public AddQuestionPage clcikQuestionDataButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(questionDataButton));
        driver.findElement(questionDataButton).click();
        return new AddQuestionPage(driver);
    }
}
