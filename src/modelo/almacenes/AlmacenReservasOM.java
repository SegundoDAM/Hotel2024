package modelo.almacenes;

import java.time.LocalDate;
import java.util.List;

import modelo.data.Cliente;
import modelo.data.Habitacion;
import modelo.data.Reserva;
import modelo.objectmother.ReservaOM;

public class AlmacenReservasOM implements AlmacenReservas{
	private List<Reserva> reservas;
	
	
	
	public AlmacenReservasOM(List<Cliente> clientes) {
		super();
		reservas=ReservaOM.crearColeccionReservas(clientes);
	}



	public List<Habitacion> buscarHabitacionesDisponibles(LocalDate fecha, int duracion){
		return null;
	}



	@Override
	public Long getNextId() {
		return reservas.size()+1L;
	}



	@Override
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
		
	}
}
