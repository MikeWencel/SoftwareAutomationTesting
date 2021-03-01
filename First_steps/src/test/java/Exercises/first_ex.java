package Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_ex {
    WebDriver driver;

    @BeforeEach
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280,720));
    }

    @AfterEach
    public void finish(){
        driver.close();
        driver.quit();
    }

    @Test
    public void example(){
        driver.navigate().to("https://aviko.pl");

    }
    @Test
    public void getWebTitle(){
        driver.navigate().to("https://aviko.pl");
        String avikoTitle = "Aviko Polska";
        Assertions.assertEquals(avikoTitle,driver.getTitle(), "Page source does not contain " + avikoTitle);
    }
}
