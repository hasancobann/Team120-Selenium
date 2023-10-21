package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkOtomasyonTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa başlığı: " + driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik = "Amazon";
        String actualTitle =driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title test passed");
        }else {
            System.out.println("Title test failed");
            System.out.println("Sayfadaki actual title: "+actualTitle);
        }

        // 6. Sayfa adresini(url) yazdirin
        System.out.println("Actual sayfa url: "+driver.getCurrentUrl());

        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrlIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test passed");
        }else {
            System.out.println("Url test failed");
        }

        // 8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle değeri: "+driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi="alişveriş";
        String actualSayfaKaynakKodlari= driver.getPageSource();

        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerigi)){
            System.out.println("Sayfa kaynağı testi passed");
        }else {
            System.out.println("Sayfa kaynağı testi failed");
            System.out.println("Sayfa kaynak kodlari '"+expectedSayfaIcerigi + "' kelimesi içermiyor.");
        }

        // 10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();

    }
}
