package modelo.almacenes;

import java.time.LocalDate;
import java.util.List;

import modelo.data.Habitacion;
import modelo.data.Reserva;

public class AlmacenReservasFichero implements AlmacenReservas{
	private List<Reserva> reservas;

	public AlmacenReservasFichero() {
		super();
		// Leo las reservas del fichero
	}

	public List<Habitacion> buscarHabitacionesDisponibles(LocalDate fecha, int duracion) {
		return null;
	}
}
