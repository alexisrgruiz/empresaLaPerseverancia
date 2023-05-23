package empleados;

public abstract class Empleado {

	protected final Double PAGO_HIJO = 200.00;
	protected final Double PAGO_CONYUGE = 100.00;
	
	protected Integer cantHijos;
	protected Boolean casado;
	protected Integer cantHorasTrabajadas;
	
	public Empleado(Integer cantHorasTrabajadas, Boolean casado, Integer cantHijos) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	public Integer getCantHijos() {
		return cantHijos;
	}

	public Boolean getCasado() {
		return casado;
	}

	public Integer getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}
	
	protected abstract Double getSalario();
}
