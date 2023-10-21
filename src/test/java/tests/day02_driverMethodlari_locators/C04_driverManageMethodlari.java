package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Thread.sleep ten farklı görev odaklıdır. Görev tamamlandığında yoluna devam eder.(Thread.sleep ise belirtilen
        // süre kadar bekler) ancak belirttiğimiz sürede görevi tamamlayamazsa hata verir.
        // görev : sayfanın açılması ve kullanılacak web elementlerinin bulunmasıdır.

        System.out.println("maximize size : "+ driver.manage().window().getSize()); // maximize size : (2560, 1415) piksel
        System.out.println("maximize konum : "+ driver.manage().window().getPosition());

        // window'u fullscreen yapın
        driver.manage().window().fullscreen();

        System.out.println("fullscreen size : "+ driver.manage().window().getSize());
        System.out.println("fullscreen konum : "+ driver.manage().window().getPosition());

        // window'un başlangıç konumunu (200,300) ve boyutunu (500,500) yapın
        driver.manage().window().setPosition(new Point(200,300));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("customize size : "+ driver.manage().window().getSize()); // customize size : (500, 500)
        System.out.println("customize  konum : "+ driver.manage().window().getPosition()); //customize  konum : (200, 300)



        Thread.sleep(3000);
        driver.close();


    }
}
