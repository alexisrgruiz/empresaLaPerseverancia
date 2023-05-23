package empleados;

import java.util.HashSet;

public class Empresa {

	private Integer cuit;
	private String razonSocial;
	private HashSet<Empleado> empleados = new HashSet<Empleado>();

	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public Integer getCuit() {
		return cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public Boolean AgregarEmpleado(Empleado emp) {
		return empleados.add(emp);
	}

	public HashSet<Empleado> getEmpleados() {
		return this.empleados;
	}

	
}
