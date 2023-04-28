package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.Conexion;
public class LoginDao {
	static String r;
	public static int validar(String user, String pass) {
		
		Connection con;
		Conexion cn = new Conexion();		
		PreparedStatement ps;
		ResultSet rs;
		String us = "";
		int valido =0;
		String sql = "select * from personas.usuario where username = ? and password = ?";
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				us = rs.getString("Rut");
			}
			if(us.length()>0){//(us.equals("admin")) {
				valido=1;
				r= us;

			}else {
				valido=0;
			}		
		}catch(Exception e) {
			//e.getMessage();
		}		
		return valido;
	}	
public static String mostrarDatos() {		
		Connection con;
		Conexion cn = new Conexion();	
		PreparedStatement ps;
		ResultSet rs;
		String us="";
		String sql = "select * from personas.persona where Rut = ?";
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, r);
			rs = ps.executeQuery();
			while(rs.next()) {
				us = rs.getString("Rut") +" - "+ rs.getString("Nombre") +" "+ rs.getString("Apellido") +" - "+ rs.getString("Telefono");
			}		
		}catch(Exception e) {
			//e.getMessage();
		}		
		return us;
	}	
}
