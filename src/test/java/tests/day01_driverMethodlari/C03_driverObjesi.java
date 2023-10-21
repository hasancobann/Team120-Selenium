package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverObjesi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // driveri tam ekranı yapmak için kullanırız
        driver.get("https://www.amazon.com"); // url yazarken www kullanmazsak da istenen url'e gider, ancak https:// yazmazsak gitmez

        Thread.sleep(3000); // driver belirtiğimiz süre kadar bekledikten sonra kapatır.
        driver.close(); // açtığımız driverları kapatır.
    }
}
