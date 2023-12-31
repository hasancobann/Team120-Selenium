package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath_TextKullanimi {
    public static <WebDriver> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver= (WebDriver) new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete buton testi passed");
        }else {
            System.out.println("Delete buton testi failed");
        }
        // 4- Delete tusuna basin
        deleteButonu.click();
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add/Remove testi passed");
        }else {
            System.out.println("Add/Remove testi failed");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
