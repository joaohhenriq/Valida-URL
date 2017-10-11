package br.com.url;

import org.junit.Test;

public class UrlValidaTest {
	@Test
    public void converteNumeroTest(){
    	UrlValida urlValida = new UrlValida();
    	
    	urlValida.validaURL("https://ead.inf.ufg.br/login/index.php");
    	urlValida.validaURL("https://hangouts.google.com/");
    }  
}
