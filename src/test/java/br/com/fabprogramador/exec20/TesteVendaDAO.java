package br.com.fabprogramador.exec20;

import br.com.fabprogramador.exec20.jdbc.ConexaoFactory;

public class TesteVendaDAO {
	
	public static void main(String[] args){
		
		testaConexao();
		System.out.println("Aplicação conectada com Sucesso com o banco exec!");
		
	}
	public static void testaConexao(){
		ConexaoFactory.getConexao();
	}


}
