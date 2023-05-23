package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoPermanenteTest {

	@Test
	public void queElSalarioDeUnEmpleadoPermanenteSeaCorrecto() {
		
		final Integer CANT_HORAS_TRABAJADAS1 = 80;
		final Boolean ESTA_CASADO1 = true;
		final Integer CANT_HIJOS1 = 2;
		final Integer ANTIGUEDAD1 = 6;
		
		final Integer CANT_HORAS_TRABAJADAS2 = 160;
		final Boolean ESTA_CASADO2 = false;
		final Integer CANT_HIJOS2 = 1;
		final Integer ANTIGUEDAD2 = 10;
	
		final Double SALARIO_ESPERADO1 = 25100.00;
		final Double SALARIO_ESPERADO2 = 49200.00;
				
		EmpleadoPermanente empPermanentePrueba1 = new EmpleadoPermanente(CANT_HORAS_TRABAJADAS1,ESTA_CASADO1,CANT_HIJOS1,ANTIGUEDAD1);
		EmpleadoPermanente empPermanentePrueba2 = new EmpleadoPermanente(CANT_HORAS_TRABAJADAS2,ESTA_CASADO2,CANT_HIJOS2,ANTIGUEDAD2);

		assertEquals(SALARIO_ESPERADO1, empPermanentePrueba1.getSalario(), 0.01);
		assertEquals(SALARIO_ESPERADO2, empPermanentePrueba2.getSalario(), 0.01);
	}

}
