package modelo.almacenes;

import java.time.LocalDate;
import java.util.List;

import modelo.data.Habitacion;
import modelo.data.Reserva;

public interface AlmacenReservas  {
	public List<Habitacion> buscarHabitacionesDisponibles(LocalDate fecha, int duracion);

	public Long getNextId();

	public void agregarReserva(Reserva reserva);
}
