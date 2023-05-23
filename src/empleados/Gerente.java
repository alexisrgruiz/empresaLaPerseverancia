package empleados;

public class Gerente extends EmpleadoPermanente{

	private final Double PAGO_HORA = 400.00;
	private final Double PAGO_ANTIGUEDAD = 150.00;

	public Gerente(Integer cantHorasTrabajadas, Boolean casado, Integer cantHijos, Integer antiguedad) {
		super(cantHorasTrabajadas,casado,cantHijos,antiguedad);
	}

	@Override
	public Double getSalario() {
		
		return super.getCasado() == true? super.cantHorasTrabajadas * this.PAGO_HORA + super.PAGO_CONYUGE + super.cantHijos * super.PAGO_HIJO + super.antiguedad * this.PAGO_ANTIGUEDAD:
										  super.cantHorasTrabajadas * this.PAGO_HORA + super.cantHijos * super.PAGO_HIJO + super.antiguedad * this.PAGO_ANTIGUEDAD;
	}
}
