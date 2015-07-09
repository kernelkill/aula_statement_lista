package br.com.fabprogramador.exec20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	public static Connection getConexao() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql:exec", "postgres","toor");
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar com o banco", e);
		}
	}

}