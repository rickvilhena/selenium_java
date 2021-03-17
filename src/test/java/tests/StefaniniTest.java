package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Objetos;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;



public class StefaniniTest extends Objetos {

    private WebDriver navegador;

    @Before
    public void init() {
        System.setProperty( CHROME_DRIVER , DIRETORIO_NAVEGADOR);
        configNavegador();
    }

    @Test
    public void errorName() {
        navegador.get(URL);
        navegador.findElement(CLICAR_EM_NOME).sendKeys("");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_NOME_OBRIGATORIO);
        String mensagem = mensagemError.getText();
        assertEquals("O campo Nome é obrigatório.", mensagem);
    }

    @Test
    public void errorEmail() {
        navegador.get(URL);
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_EMAIL_OBRIGATORIO);
        String mensagem = mensagemError.getText();
        assertEquals("O campo E-mail é obrigatório.", mensagem);
    }

    @Test
    public void errorPassword() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_SENHA_OBRIGATORIO);
        String mensagem = mensagemError.getText();
        assertEquals("O campo Senha é obrigatório.", mensagem);

    }


    @Test
    public void erroFull() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_NOME_OBRIGATORIO);
        String mensagem = mensagemError.getText();
        assertEquals("O campo Nome é obrigatório.", mensagem);

        WebElement mensagemError2 = navegador.findElement(ERRO_CAMPO_EMAIL_OBRIGATORIO);
        String mensagem2 = mensagemError2.getText();
        assertEquals("O campo E-mail é obrigatório.", mensagem2);

        WebElement mensagemError3 = navegador.findElement(ERRO_CAMPO_SENHA_OBRIGATORIO);
        String mensagem3 = mensagemError3.getText();
        assertEquals("O campo Senha é obrigatório.", mensagem3);

    }

    @Test
    public void erroNameIncomplet() {

        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_NOME_COMPLETO);
        String mensagem = mensagemError.getText();
        assertEquals("Por favor, insira um nome completo.", mensagem);

    }

    @Test
    public void erroEmailIncomplet() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_EMAIL_INVALIDO);
        String mensagem = mensagemError.getText();
        assertEquals("Por favor, insira um e-mail válido.", mensagem);

    }

    @Test
    public void erroSenhaIncomplet() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("123");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

        WebElement mensagemError = navegador.findElement(ERRO_CAMPO_SENHA_8CARACTERES);
        String mensagem = mensagemError.getText();
        assertEquals("A senha deve conter ao menos 8 caracteres.", mensagem);

    }

    @Test
    public void usuarioCadastrado() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

    }

    @Test
    public void usuariosCadastrados() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Jorge luiz");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("jorginho@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();

    }

    @Test
    public void exclusaoDeCadastro() {
        navegador.get("http://prova.stefanini-jgr.com.br/teste/qa/");
        navegador.findElement(CLICAR_EM_NOME).sendKeys("Henrique Vilhena");
        navegador.findElement(CLICAR_EM_EMAIL).sendKeys("rickvilhenaaa@gmail.com");
        navegador.findElement(CLICAR_EM_SENHA).sendKeys("12345678");
        navegador.findElement(CLICAR_BOTAO_REGISTRAR).click();
        navegador.findElement(CLICAR_BOTAO_EXLCUIR).click();

    }

    @After
    public void finish() {
        navegador.quit();

    }

    private void configNavegador() {
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        navegador.manage().window().maximize();
    }
}
