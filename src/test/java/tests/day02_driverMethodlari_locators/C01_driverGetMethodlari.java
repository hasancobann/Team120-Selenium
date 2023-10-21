package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Title "+driver.getTitle()); // sayfanın başlığını getirir
        System.out.println("Url: "+driver.getCurrentUrl()); // sayfa url'sini getirir
        System.out.println("-------");
        System.out.println(driver.getPageSource()); // html ve java script kodlarını getirir

        System.out.println("Window handle değeri: "+driver.getWindowHandle());
        System.out.println("Window handle değerleri seti: "+driver.getWindowHandles());

        /*
        Webdriver her pencereye unique bir window handle değeri ataması yapar.

        bir test class'ı çalışmaya başladıktan sonra birden fazla pencere açılabilir.
        bu durumda bir tek window handle değeri değil açılan sayfa sayısı kadar handle değerimiz olur.
        Birden fazla element olunca Selenium onları Set'e koymayı uygun görmüş.
         */


        Thread.sleep(1000);
        driver.close();
    }
}
