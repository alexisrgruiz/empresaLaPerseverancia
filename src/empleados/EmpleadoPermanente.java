package empleados;

public class EmpleadoPermanente extends Empleado{

	private final Double PAGO_HORA = 300.00;
	private final Double PAGO_ANTIGUEDAD = 100.00;
	
	protected Integer antiguedad;

	public EmpleadoPermanente(Integer cantHorasTrabajadas, Boolean casado, Integer cantHijos, Integer antiguedad) {
		super(cantHorasTrabajadas,casado,cantHijos);
		this.antiguedad = antiguedad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	@Override
	protected Double getSalario() {
		
		return super.getCasado() == true? super.cantHorasTrabajadas * this.PAGO_HORA + super.PAGO_CONYUGE + super.cantHijos * super.PAGO_HIJO + this.antiguedad * this.PAGO_ANTIGUEDAD :
										  super.cantHorasTrabajadas * this.PAGO_HORA + super.cantHijos * super.PAGO_HIJO + this.antiguedad * this.PAGO_ANTIGUEDAD;
	}
}
