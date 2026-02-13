package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver  driver;
    By userName = By.id("username");
    By password = By.id("password");
    By btnLogin = By.cssSelector("#login > button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String user){
        driver.findElement(userName).sendKeys(user);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }
    public void login(String user, String pass){
        enterUserName("tomsmith");
        enterPassword("SuperSecretPassword!");
        clickLogin();
    }
}
