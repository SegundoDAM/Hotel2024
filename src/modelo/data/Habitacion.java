package modelo.data;

public class Habitacion {
	private String datosHabitacion;
	private int numero;
	private TipoHabitacion tipo;

	

	public Habitacion(String datosHabitacion, int numero, TipoHabitacion tipo) {
		super();
		this.datosHabitacion = datosHabitacion;
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getDatosHabitacion() {
		return datosHabitacion;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public int getNumero() {
		return numero;
	}

}
