package empleados;

public class EmpleadoTemporario extends Empleado{

	
	private final Double PAGO_HORA = 200.00;

	public EmpleadoTemporario(Integer cantHorasTrabajadas, Boolean casado, Integer cantHijos) {
		super(cantHorasTrabajadas,casado,cantHijos);
	}

	@Override
	protected Double getSalario() {
		return super.getCasado() == true? super.cantHorasTrabajadas * this.PAGO_HORA + super.PAGO_CONYUGE + super.cantHijos * super.PAGO_HIJO:
										  super.cantHorasTrabajadas * this.PAGO_HORA + super.cantHijos * super.PAGO_HIJO;
	}
	
	

}
