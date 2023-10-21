package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna "Nutella" yazdırıp aratın
        /* Önce arama kutusunu findElement() ve locators ile driver'a tanıtıp
        o webelementi bu class'da kulanabileceğimiz şekilde kaydetmeliyiz
         */

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        /*
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Bu işlemi 2 satırda yapmak yerine istersek aşağıdaki gibi de yapabiliriz
         */
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuçlarının "Nutella" içerdiğini test edin
        /*
        By.className locator'ı class attribute'nun değeri boşluk içerdiğinde SAĞLIKLI ÇALIŞMAZ

        Çoğunlukla class ismi aynı özelliklerdeki webelementleri gruplandırmak için kullanılır
        bizde class değeri "sg-col-inner" arattığımızda 73 tane webelement buldu.

         WebElement aramaSonucElementi=driver.findElement(By.className("sg-col-inner"));
         */
        List<WebElement> elementlerListesi = driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementlerListesi.get(0).getText();
        System.out.println(actualAramaSonucu); // 1-48 of 737 results for "Nutella"

        if (actualAramaSonucu.contains("Nutella")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }


        Thread.sleep(3000); // üzerinde çalışırken sayfayı görmek için kullanırız. testi hazırladıktan sonra sileriz.
        driver.close();
    }
}
