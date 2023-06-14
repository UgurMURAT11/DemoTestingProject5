package Project;

import Ultis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  Project extends BaseStaticDriver {

    @Test
    void demoTestingProject() {

        WebElement login =driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();


        WebElement registerMenuBtn=driver.findElement(By.cssSelector("input[class='button-1 register-button']"));
        registerMenuBtn.click();

        WebElement Gender = driver.findElement(By.id("gender-male"));
        Gender.click();

        WebElement FirstName= driver.findElement(By.id("FirstName"));
        FirstName.sendKeys("Ugur");

        WebElement LastName=driver.findElement(By.id("LastName"));
        LastName.sendKeys("Murat");

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("asdasdasdqweqwe123123@gmail.com");

        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("asdqwe123");

        WebElement PasswordConfirm=driver.findElement(By.id("ConfirmPassword"));
        PasswordConfirm.sendKeys("asdqwe123");

        WebElement RegisterButton=driver.findElement(By.id("register-button"));
        RegisterButton.click();

        WebElement ContinueButton=driver.findElement(By.cssSelector("input[class='button-1 register-continue-button']"));
        ContinueButton.click();

    }

    @Test
    void demoTestingProject2(){

        WebElement login =driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("asdasdasdqweqwe123121232132454673@gmail.com");

        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("asdqwe123");

        WebElement Login=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        Login.click();

        WebElement errorMessage=driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));

        Assert.assertTrue(errorMessage.getText().contains("unsuccessfu"));

    }

    @Test
    void demoTestingProject3(){








    }



}
