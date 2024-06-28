package qi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MensagemSiteQi {

    static WebDriver driver;

    public MensagemSiteQi(WebDriver driver) {

        this.driver = driver;
    }

    public void preencherCampoSiteQi() {

        WebElement nome = driver.findElement(By.id("form-field-nome"));
        nome.sendKeys("Artur Bazzanella");

        WebElement email = driver.findElement(By.id("form-field-email"));
        email.sendKeys("arturbc@gmail.com");

        WebElement telefone = driver.findElement(By.id("form-field-telefone"));
        telefone.sendKeys("51999922078");

        WebElement cpf = driver.findElement(By.id("form-field-cpf"));
        cpf.sendKeys("90329970097");

        WebElement cidade = driver.findElement(By.id("form-field-cidade"));
        Select objCidade = new Select(driver.findElement(By.id("form-field-cidade")));
        objCidade.selectByVisibleText("Porto Alegre");

        WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
        Select objSolicitacao = new Select(driver.findElement(By.id("form-field-solicitacao")));
        objSolicitacao.selectByVisibleText("Solicitação");

        WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
        mensagem.sendKeys("Olá!\n" +
                "\n" +
                "Este email é um teste de automação.\n" +
                "\n" +
                "Por favor, pode respondê-lo como \"recebido\", os dados são verdadeiros.\n" +
                "\n" +
                "Grato pelo sua ajuda.\n" +
                "\n" +
                "Artur.\n");

        WebElement btAvancar = driver.findElement(By.xpath("//span[contains(text(),'Pronto, quero enviar a mensagem')]"));
        btAvancar.click();

    }
}


