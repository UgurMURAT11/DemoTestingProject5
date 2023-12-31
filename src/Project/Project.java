package Project;

import Ultis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  Project extends BaseStaticDriver {

    @Test
    void demoTestingProject() {

        //scenario1

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

        //scenario2
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

        //scenario3
        WebElement Laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        Laptop.click();

        WebElement addToCart=driver.findElement(By.id("add-to-cart-button-31"));
        addToCart.click();

        WebElement ShoppingCart=driver.findElement(By.linkText("shopping cart"));
        ShoppingCart.click();

        WebElement click=driver.findElement(By.id("termsofservice"));
        click.click();

        WebElement Checkout=driver.findElement(By.id("checkout"));
        Checkout.click();

        Bekle(1);

        WebElement SelectCountry=driver.findElement(By.cssSelector("input[class='button-1 new-address-next-step-button']"));
        SelectCountry.click();


        WebElement Continue1= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='Shipping.save()']")));
        Continue1.click();

        WebElement Continue2=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='button-1 shipping-method-next-step-button']")));
        Continue2.click();

        WebElement Payment3=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Payments.PurchaseOrder']")));
        Payment3.click();

        WebElement Continue3=driver.findElement(By.cssSelector("input[class='button-1 payment-method-next-step-button']"));
        Continue3.click();

        WebElement Continue4=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='button-1 payment-info-next-step-button']")));
        Continue4.click();

        WebElement Confirm=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='button-1 confirm-order-next-step-button']")));
        Confirm.click();

        WebElement mesaj= wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='Your order has been successfully processed!']")));

        Assert.assertTrue(mesaj.isDisplayed());

        WebElement Continue5=driver.findElement(By.cssSelector("input[class='button-2 order-completed-continue-button']"));
        Continue5.click();
















    }



}
