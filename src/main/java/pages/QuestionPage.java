package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuestionPage {
    private WebDriver driver;
    public QuestionPage(WebDriver driver){
        this.driver=driver;
    }

    private By requestMethod=
            By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@role='button']");
    private By option=By.xpath("//div[@class='v-list-item__title'][contains(text(),'الوصول المباشر')]");
    private By requesterName=
            By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@xs='9'][2]//div[@role='combobox']");
    private By option2=
            By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@xs='9'][2]//div[@role='combobox']//input[1]");
    private By organization=
            By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]");
    private By option3 =
            By.xpath("//div[contains(text(),'OCMU')]");
    private By department=
            By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[1]/div[1]/div[1]");
    private By option4=
           By.xpath("//div[contains(text(),'Children Ward')]");
    private By classification=
           By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[5]/div/div/div[1]/div[1]/div[1]");
    private By option5=
          By.xpath("//div[contains(text(),'Dosage')]");
    private By chooseDrug=By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-item--active']//div[@class='row'][1]//div[@role='combobox']//div[@class='v-select__selections']//input");
    private By option6=By.xpath("//div[@role='listbox']//div[@role='option'][1]//div[contains(text(),'(Tab)')]");
    private By questionTitle=
        By.xpath("(//div[@class='v-input__slot']/div[contains(@class, 'v-text-field__slot')]/input)[5]");
    private By question=By.xpath("(//textarea[@required='required' and @rows='3'])[1]\n");
    private By saveButton=By.xpath("//*[@id=\"AppsContent\"]/div/div/div/div/div[1]/button");

    public void clickRequesthMethod(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(requestMethod));
        driver.findElement(requestMethod).click();
        wait.until(ExpectedConditions.elementToBeClickable(option));
        driver.findElement(option).click();
    }
    public void clickRequesterName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(requesterName));
        driver.findElement(requesterName).click();
        wait.until(ExpectedConditions.elementToBeClickable(option2));
        driver.findElement(option2).sendKeys("شيماء حسين");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

    }
    public void clickOrganization(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(organization));
        driver.findElement(organization).click();
        wait.until(ExpectedConditions.elementToBeClickable(option3));
        driver.findElement(option3).click();
    }
    public void clickDepartment(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(department));
        driver.findElement(department).click();
        wait.until(ExpectedConditions.elementToBeClickable(option4));
        driver.findElement(option4).click();
    }
    public void clickClassification(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(classification));
        driver.findElement(classification).click();
        wait.until(ExpectedConditions.elementToBeClickable(option5));
        driver.findElement(option5).click();
    }
    public void clickChooseDrug(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(chooseDrug));
        driver.findElement(chooseDrug).click();
        wait.until(ExpectedConditions.elementToBeClickable(chooseDrug));
        driver.findElement(chooseDrug).sendKeys("بنادول");
        wait.until(ExpectedConditions.elementToBeClickable(chooseDrug));
        driver.findElement(option6).click();
    }
    public void setQuestionTitle(String text){
        driver.findElement(questionTitle).sendKeys(text);
    }
    public void setQuestion(String txt){
        driver.findElement(question).sendKeys(txt);
    }
    public void clickButton(){
        driver.findElement(saveButton).click();
    }










}
