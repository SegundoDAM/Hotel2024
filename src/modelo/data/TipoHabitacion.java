package modelo.data;

public enum TipoHabitacion {
	normal("Normal",30f),doble("Doble",50f), matrimonial("Matrinomial",75f);
	
	private String nombre;
	private Float precio;
	private TipoHabitacion(String nombre, Float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
}
