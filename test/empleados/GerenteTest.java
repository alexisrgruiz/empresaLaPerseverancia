package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void queElSalarioDeUnGerenteSeaCorrecto() {
		
		final Integer CANT_HORAS_TRABAJADAS = 160;
		final Boolean ESTA_CASADO = true;
		final Integer CANT_HIJOS = 1;
		final Integer ANTIGUEDAD = 10;
		
		final Double PAGO_HORA = 400.00;
		final Double PAGO_HIJO = 200.00;
		final Double PAGO_CONYUGE = 100.00;
		final Double PAGO_ANTIGUEDAD = 150.00;
				
		final Double SALARIO_ESPERADO = CANT_HORAS_TRABAJADAS * PAGO_HORA + PAGO_CONYUGE + CANT_HIJOS * PAGO_HIJO + ANTIGUEDAD * PAGO_ANTIGUEDAD;
				
		Gerente gtePrueba = new Gerente(CANT_HORAS_TRABAJADAS,ESTA_CASADO,CANT_HIJOS,ANTIGUEDAD);
		
		assertEquals(SALARIO_ESPERADO, gtePrueba.getSalario(), 0.01);
	}

}
