package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTemporarioTest {

	@Test
	public void queElSalarioDeUnEmpleadoTemporarioSeaCorrecto() {
		
		final Integer CANT_HORAS_TRABAJADAS = 80;
		final Boolean ESTA_CASADO = true;
		final Integer CANT_HIJOS = 0;
				
		final Double SALARIO_ESPERADO = 16100.00;
				
		EmpleadoTemporario empTemporarioPrueba = new EmpleadoTemporario(CANT_HORAS_TRABAJADAS,ESTA_CASADO,CANT_HIJOS);
		
		assertEquals(SALARIO_ESPERADO, empTemporarioPrueba.getSalario(), 0.01);
	}

}
