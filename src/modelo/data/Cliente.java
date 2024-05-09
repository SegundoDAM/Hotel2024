package modelo.data;

public class Cliente {
	private String DNI;
	private String datosPersonales;
	private boolean habitual;
	/**
	 * Si todos los clientes habituales tienen el mismo descuento, esta es una
	 * forma de implementarlo
	 */
	private static float decuentoHabitual=15f;

	
	public Cliente(String dNI, String datosPersonales) {
		super();
		DNI = dNI;
		this.datosPersonales = datosPersonales;
	}
	public static float getDecuentoHabitual() {
		return decuentoHabitual;
	}
	public static void setDecuentoHabitual(float decuentoHabitual) {
		Cliente.decuentoHabitual = decuentoHabitual;
	}
	public boolean isHabitual() {
		return habitual;
	}
	public void setHabitual(boolean habitual) {
		this.habitual = habitual;
	}
	
}
