package utils;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConexionTest {

	@Test
	public void testGetConnection() {
		String url = "jdbc:mysql://localhost:3306/personas?serverTimezone=UTC";
		String user = "root";
		String pass = "";
		
		System.out.println("Conectando a la BD...");
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass); 
			assertNotNull(con);
			System.out.println("Acceso correcto");
		}catch(Exception e) {		
			System.out.println("Error de conexión");			
		}		
	}
}
