package ejercicio3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuentaTest {
	Cuenta c;
	@Before
	public void setUp() throws Exception {
		c=new Cuenta("Jesús",1000);
	}

	@Test
	public void testCuenta() {
		Cuenta c2=new Cuenta();
		assertEquals(null,c2.getTitular());
		assertEquals(0, c2.getCantidad(),0.01);
	}

	@Test
	public void testCuentaStringDouble() {
		Cuenta c3=new Cuenta("Pepe",2000);
		assertEquals("Pepe",c3.getTitular());
		assertEquals(2000, c3.getCantidad(),0.01);
	}

	@Test
	public void testGetTitular() {
		assertEquals("Jesús",c.getTitular());
	}

	@Test
	public void testSetTitular() {
		c.setTitular("Juan");
		assertEquals("Juan",c.getTitular());
	}

	@Test
	public void testGetCantidad() {
		assertEquals(1000, c.getCantidad(),0.01);
	}

	@Test
	public void testSetCantidad() {
		c.setCantidad(30000);
		assertEquals(30000, c.getCantidad(),0.01);
	}

	@Test
	public void testToString() {
		assertEquals("Cuenta [titular=Jesús, cantidad=1000.0]","Cuenta [titular=" + c.getTitular() + ", cantidad=" + c.getCantidad() + "]");
	}

	@Test
	public void testIngresar() {
		c.ingresar(400);
		assertEquals(1400,c.getCantidad(),0.01);
	}

	@Test
	public void testRetirar() {
		c.retirar(400);
		assertEquals(600,c.getCantidad(),0.01);
	}

}
