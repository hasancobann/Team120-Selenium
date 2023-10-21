package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new SafariDriver(); // Selenium kendi webdriver'ını kullanır
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");


        // sayfa başlığının "smile more" içerdiğini test edin
        String expectedTittleIcerik ="smile more";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTittleIcerik)){
            System.out.println("Amazon tittle test Passed");
        }else System.out.println("Amazon tittle test Failed");

        // youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");


        // url'in "youtube" içerdiğini test edin
        String expectedUrlIcerik="youtube";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube url test passed");
        }else System.out.println("youtube url test failed");

        // tekrar amazon anasayfaya dönün ve url'in "ramazan" içermediğini test edin
        driver.navigate().back();
        String unExpectedUrlIcerik="ramazan";
        actualUrl=driver.getCurrentUrl();


        if (actualUrl.contains(unExpectedUrlIcerik)){
            System.out.println("Amazon url test failed");
        }else {
            System.out.println("Amazon url test passed");
        }

        // tekrar youtube anasayfaya gidin sayfa kaynak kodlarında "music geçtiğini test edin
        driver.navigate().forward();
        String expectedSayfaIcerik="music";
        String actualSayfaKaynakKodlari= driver.getPageSource();


        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerik)){
            System.out.println("Youtube kaynak kodu tesi passed");
        }else{
            System.out.println("Youtube kaynak kodu testi failed");
        }

        // sayfayı kapatın
        Thread.sleep(2000);
        driver.close();



    }
}
