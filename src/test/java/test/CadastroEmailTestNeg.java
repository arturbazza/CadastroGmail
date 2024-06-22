package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import positivepages.CadastroData;
import positivepages.CadastroNome;
import negativepages.CadastroEmailNeg;
public class CadastroEmailTestNeg {
        static WebDriver driver;
        static CadastroNome cadastroNome;
        static CadastroData cadastroData;
        static CadastroEmailNeg cadastroEmailNeg;
        @Before
        public void setUp() throws Exception {
    }
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);
        cadastroData = new CadastroData(driver);
        cadastroEmailNeg = new CadastroEmailNeg(driver);

        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmailNeg.preencherCampo();

        cadastroEmailNeg.validarMensagemGoogleEmail();
    }
    @After
    public void tearDown() throws Exception {
    }
}
