package test.negative;

import negativepages.CadastroPhoneNeg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import positivepages.*;

public class CadastroPhoneTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroData cadastroData;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroPhoneNeg cadastroPhoneNeg;

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
        cadastroSenha = new CadastroSenha(driver);

        cadastroPhoneNeg = new CadastroPhoneNeg(driver);

        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmail.preencherCampo();
        cadastroSenha.preencherCampo();

        CadastroPhoneNeg.validarMensagemGooglePhone();

    }

    @After
    public void tearDown() throws Exception {
    }
}
