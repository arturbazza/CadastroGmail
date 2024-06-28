package test.siteqi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qi.MensagemSiteQi;

import java.io.IOException;

public class MensagemSiteQiTest {

    static WebDriver driver;
    static MensagemSiteQi preencherCampoSiteQi;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test2() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");

        preencherCampoSiteQi = new MensagemSiteQi(driver);
        preencherCampoSiteQi.preencherCampoSiteQi();
    }

    @After
    public void tearDown() throws Exception {
    }

}