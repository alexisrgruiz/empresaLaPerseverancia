package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void queSePuedanGuardarAtributosDeEmpresa() {
		
		final Integer CUIT = 12376;
		final String RAZON_SOCIAL = "PERSEVERAN S.A";
		Empresa laPerseverancia = new Empresa(CUIT, RAZON_SOCIAL);
		
		assertEquals(CUIT, laPerseverancia.getCuit());
		assertEquals(RAZON_SOCIAL, laPerseverancia.getRazonSocial());
	}
	
	@Test
	public void queSePuedanAgregarEmpleadosALaEmpresa() {
		
		final Integer CUIT = 12376;
		final String RAZON_SOCIAL = "PERSEVERAN S.A";
		Empresa laPerseverancia = new Empresa(CUIT, RAZON_SOCIAL);
		
		EmpleadoPermanente empPerm1 = new EmpleadoPermanente(80,true,2,6);
		EmpleadoPermanente empPerm2 = new EmpleadoPermanente(160,false,0,4);
		EmpleadoTemporario empTemp = new EmpleadoTemporario(80,true,0);
		Gerente gte = new Gerente(160,true,1,10);
		
		assertTrue(laPerseverancia.AgregarEmpleado(empPerm1));
		assertTrue(laPerseverancia.AgregarEmpleado(empPerm2));
		assertTrue(laPerseverancia.AgregarEmpleado(empTemp));
		assertTrue(laPerseverancia.AgregarEmpleado(gte));
		assertEquals(4,laPerseverancia.getEmpleados().size());
	}

}
