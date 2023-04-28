package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas?serverTimezone=UTC", "root", "");
		}catch(Exception e){
			e.getMessage();
		}
		return con;
	}

}
