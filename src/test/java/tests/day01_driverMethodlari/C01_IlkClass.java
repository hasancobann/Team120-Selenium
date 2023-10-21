package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        /*test için her class oluşturduğumuzda ilk yapmamız gereken
        WebDriver objesi oluşturmaktır.
        WebDriver objesi istediğimiz browser'ın bir kopyasını oluşturup istediğimiz web işlemnlerini yapacak.

         */

        //Her class'da o class'da kullanacağımız browser'ı tanıtmalıyız.

        git a

        //WebDriver objesi oluşturalım

        WebDriver driver=new ChromeDriver();

        // Artık bu driver objesi ile istenen otomasyonları yapabiliriz.

        driver.get("https://www.amazon.com");

    }
}
