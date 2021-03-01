package DriverMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WikiNasaTest {


    WebDriver driver;

    @BeforeEach
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280,720));
    }


    @AfterEach
    public void driverQuit(){
        driver.close();
        driver.quit();
    }

    @Test
    public void navigate(){
        driver.navigate().to("https://pl.wikipedia.org");
        driver.navigate().to("https://www.nasa.gov");
        driver.navigate().back();
        String wikiTitle = "Wikipedia, wolna encyklopedia";
        Assertions.assertEquals(wikiTitle, driver.getTitle(), "The title of the page is not: " + wikiTitle);
        driver.navigate().forward();
        String nasaTitle = "NASA";
        Assertions.assertEquals(nasaTitle, driver.getTitle(), "The title of the page is not: " + nasaTitle);
    }

    @Test
    public void getCurrentURLExample(){
        String googleURL = "https://www.google.pl/";
        driver.navigate().to("https://google.pl");
        Assertions.assertEquals(googleURL, driver.getCurrentUrl(),"Current URL is not " + googleURL);
    }

    @Test
    public void getTitleExample(){
        driver.navigate().to("https://google.pl");
        String googleTitle = "Google";
        driver.navigate().to("https://google.pl");
        Assertions.assertEquals(googleTitle, driver.getTitle(),"Current URL is not " + googleTitle);
    }

    @Test
    public void getPagesSourceExample(){
        driver.navigate().to("https://google.pl");
        String googleImage = "/images/branding/googleg/1x/googleg_standard_color_128dp.png";
        driver.navigate().to("https://google.pl");
        Assertions.assertTrue(driver.getPageSource().contains(googleImage), "Page source does not contain " + googleImage);
    }

}
