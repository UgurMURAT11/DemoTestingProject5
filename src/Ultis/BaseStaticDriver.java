package Ultis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStaticDriver {
    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri() {
        System.out.println("Driver start ....");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        //çalıştır kısmında çıkan ilk 3 satırı siliyor


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);



        driver.manage().window().maximize(); //maximize ediyor büyük ekranda açıyor pencere boyutunda değil
        driver.manage().deleteAllCookies(); //bilgisayarındaki cookileri (çerezleri) siliyor

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken gecikme yapıyor ki hata olmasın
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // bütün webElemenler yüklenirken gecikme yapıyor ki hata olmasın

        driver.get("http://demowebshop.tricentis.com/");
     //   LoginTest();

    }
/*
    void LoginTest() {

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("ugur.murat.08.34@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("Asdqwe123");

        WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
        loginbtn.click();
    }
*/
    @AfterClass
    public void BitisIslemleri() {
        System.out.println("Driver stop ....");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
