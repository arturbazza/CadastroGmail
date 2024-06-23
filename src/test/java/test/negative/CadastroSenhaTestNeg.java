package test.negative;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import positivepages.CadastroData;
import positivepages.CadastroEmail;
import positivepages.CadastroNome;
import negativepages.CadastroSenhaNeg;

public class CadastroSenhaTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroData cadastroData;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaNeg cadastroSenhaNeg;

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
        cadastroEmail = new CadastroEmail(driver);

        cadastroSenhaNeg = new CadastroSenhaNeg(driver);

        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmail.preencherCampo();
        cadastroSenhaNeg.preencherCampo();

        cadastroSenhaNeg.validarMensagemGoogleSenha();
    }

    @After
    public void tearDown() throws Exception {
    }
}
