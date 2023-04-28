package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginDaoTest {
	
	@Test
	public void testValidar() {
		
		try {
		int res = LoginDao.validar("admin", "admin");
		assertEquals(1, res); //1= valido 0= no valido
		System.out.println("Acceso correcto");
		}
		catch(IllegalArgumentException e) {	
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}	
		
	}
}
