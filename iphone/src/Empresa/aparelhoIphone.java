package Empresa;

import iphone.Iphone;

public class aparelhoIphone {

	

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Reprodutor de musica");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica(null);
		
		System.out.println("Aparelho telefonico");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("Navegador da internet");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
