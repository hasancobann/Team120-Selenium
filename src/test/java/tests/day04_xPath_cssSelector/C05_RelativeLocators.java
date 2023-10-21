package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Çok özel durumlar için Selenium 4 ile Relative Locators tanıtılmıştır.

        EĞER bir web elementi gördüğümüz ve html kodları ile locate ettiğimiz halde
        locator çalışmıyorsa ;

        Çalışmayan locator'a sahip Webelement etrafındaki çalışan locator'a sahip Webeleemntler ile locate edilebilir.
         */

       // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

       // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        //<img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">

        // A- Newyork'un altındaki diye locate edelim
        WebElement nycElementi= driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));

        // B- Boston'ın yanındaki diye locate edelim
         WebElement bostonElementi= driver.findElement(By.id("pid6_thumb"));
         WebElement berlin2= driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toRightOf(bostonElementi));

         // C- Sailor'un üstü diye locate edelim
        WebElement sailorElementi= driver.findElement(By.id("pid11_thumb"));
        WebElement berlin3= driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).above(sailorElementi));

       // 3 ) Relative locator’larin dogru calistigini test edin
      if (berlin1.getDomAttribute("id").equals("pid7_thumb")){
          System.out.println("Berlin1 testi passed");
      }else {
          System.out.println("Berlin1 testi failed");
      }

        if (berlin2.getDomAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin2 testi passed");
        }else {
            System.out.println("Berlin2 testi failed");
        }

        if (berlin3.getDomAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin3 testi passed");
        }else {
            System.out.println("Berlin3 testi failed");
        }

        driver.close();

    }
}
