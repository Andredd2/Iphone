package iphone;

import iphone.Aplicaçoes.AparelhoTelefonico;
import iphone.Aplicaçoes.NavegadorInternet;
import iphone.Aplicaçoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	
	public void tocar() {
		System.out.println("tocando musica");
		
	}

	
	public void pausar() {
		System.out.println("pausando musica");
		
	}

	
	public void selecionarMusica(String musica) {
		System.out.println("selecionando a musica");
		
	}

	
	public void exibirPagina() {
		System.out.println("exibindo pagina");
		
	}

	
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba");
		
	}

	
	public void atualizarPagina() {
		System.out.println("atualizando pagina");
		
	}

	
	public void ligar() {
		System.out.println("ligando");
		
	}

	
	public void atender() {
		System.out.println("atendendo");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
		
	}
	

}
