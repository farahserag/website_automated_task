package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){this.driver=driver;}

    private By username = By.xpath("//input[@data-vv-name='username']");
    private By password =By.id("input-17");
    private By loginButton = By.cssSelector("button.MainBtn");
    private By languageButton =By.xpath("//span[contains(text(),'الإنجليزية')]");


    public void setUsername(String email){
        driver.findElement(username).sendKeys(email);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public SystemHomePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SystemHomePage(driver);
    }
    public void clickLanguageButton(){
        driver.findElement(languageButton).click();
    }

}
