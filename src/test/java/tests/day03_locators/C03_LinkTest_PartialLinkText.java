package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkTest_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        /*
        Locator olarak By.linkText() kullanıyorsak <a> </a> arasındaki tüm karakterleri kullanmalıyız.
        Boşluk, özel karakter, harf veya rakam olmasına bakmaksızın tüm aralığı kapatmalıyız.

        Eğer tüm yazıyı değilde bir kısmını kullanmak istersek By.linkText() yerine By.partialLinkText() kullanabiliriz
         */

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // giftcard linkine tıklayın
            // driver.findElement(By.linkText("Gift Cards")).click(); === çalışır
            //driver.findElement(By.partialLinkText("Gift")).click(); === çalışır
            driver.findElement(By.partialLinkText("Gif")).click();

        // Linkin bizi gift cards sayfasına yönlendirdiğini test edin
         //=== bunun için gift cards sayfayı açıldığında gift card yazısının görünür olduğunu test edelim

        WebElement giftCardYaziElementi= driver.findElement(By.className("nav-menu-logo"));

        if (giftCardYaziElementi.isDisplayed()){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        // sayfayı kapatın
        Thread.sleep(3000);
        driver.close();
    }
}
