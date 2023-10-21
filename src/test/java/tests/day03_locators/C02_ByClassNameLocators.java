package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocators {
    public static void main(String[] args) throws InterruptedException {

       // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/ ");

       // 3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryList=driver.findElements(By.className("panel-title"));

       // 4- Category bolumunde 3 element oldugunu test edin
        int expectedCategorySayisi=3;
        int actualCategorySayisi=categoryList.size();

        if (expectedCategorySayisi==actualCategorySayisi){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
       // 5- Category isimlerini yazdirin
          //System.out.println(categoryList);
          // Webelementlerden oluşan bir listeyi, direkt yazdıramayız.
          // For-each loop ile her bir Webelementi ele alıp üzerindeki yazıyı yazdırabiliriz.

        for (WebElement each:categoryList
             ) {
            System.out.println(each.getText());
        }

        // 6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
