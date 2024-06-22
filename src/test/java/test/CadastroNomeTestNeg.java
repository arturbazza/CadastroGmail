package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import negativepages.CadastroNomeNeg;

public class CadastroNomeTestNeg {
    static WebDriver driver;
    static CadastroNomeNeg cadastroNomeNeg;
    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNomeNeg = new CadastroNomeNeg(driver);
        cadastroNomeNeg.preencherCampo();

        cadastroNomeNeg.validarMensagemGoogleNome();
    }

    @After
    public void tearDown() throws Exception {
    }
}

