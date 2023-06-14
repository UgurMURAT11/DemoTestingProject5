package Ultis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActuallist) {


        for (int i = 0; i < menuExpectedList.size(); i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActuallist.get(i).getText(), "Karsılastırma sonucu");


    }

    public static void successMessageValidation() {

        WebElement YesilYaziDogrla = GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(YesilYaziDogrla.getText().toLowerCase().contains("success"));
    }
    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static double WebElementeDouble(WebElement e) {

            String result=e.getText();
            result=result.replaceAll("[^\\d]","");
            return Double.parseDouble(result);
    }

    public static int RandomGenerator(int max)
    {
        return (int)(Math.random() * max);  //max 4 ise 0-1-2-3
    }
}

