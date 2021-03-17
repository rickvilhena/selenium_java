package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Objetos {



    public final String DIRETORIO_NAVEGADOR = "C:\\Users\\Henrique\\Drivers\\Chromedriver.exe";
    public final String URL = "http://prova.stefanini-jgr.com.br/teste/qa/";
    public final String CHROME_DRIVER = "webdriver.chrome.driver";

    public final By CLICAR_EM_NOME = By.xpath("//input[@id=\"name\"]");
    public final By CLICAR_EM_EMAIL = By.xpath("//input[@id=\"email\"]");
    public final By CLICAR_EM_SENHA = By.xpath("//input[@id=\"password\"]");
    public final By CLICAR_BOTAO_REGISTRAR = By.xpath("//button[@id=\"register\"]");

    public final By ERRO_CAMPO_NOME_OBRIGATORIO = By.xpath("//p[text()='O campo Nome é obrigatório.']");
    public final By ERRO_CAMPO_EMAIL_OBRIGATORIO = By.xpath("//p[text()='O campo E-mail é obrigatório.']");
    public final By ERRO_CAMPO_SENHA_OBRIGATORIO = By.xpath("//p[text()='O campo Senha é obrigatório.']");

    public final By ERRO_CAMPO_NOME_COMPLETO = By.xpath("//p[contains(text(),'Por favor, insira um nome completo.')]");
    public final By ERRO_CAMPO_EMAIL_INVALIDO = By.xpath("//p[contains(text(),'Por favor, insira um e-mail válido.')]");
    public final By ERRO_CAMPO_SENHA_8CARACTERES = By.xpath("//p[contains(text(),'A senha deve conter ao menos 8 caracteres.')]");

    public final By CLICAR_BOTAO_EXLCUIR = By.xpath("//a[@id='removeUser1']");




}