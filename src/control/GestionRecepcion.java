package control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.almacenes.AlmacenClientes;
import modelo.almacenes.AlmacenReservas;
import modelo.almacenes.AlmacenReservasFichero;
import modelo.almacenes.AlmacenReservasOM;
import modelo.data.Cliente;
import modelo.data.Habitacion;
import modelo.data.Reserva;
import modelo.data.TipoHabitacion;
import modelo.objectmother.ClienteOM;

public class GestionRecepcion {

	private AlmacenReservas almacenReservas;
	private AlmacenClientes almacenClientes;

	public GestionRecepcion() {
		super();
		List<Cliente> clientes = ClienteOM.crearColeccionClientes(10);
		almacenReservas = new AlmacenReservasOM(clientes);
		almacenClientes = new AlmacenClientes(clientes);
	}

	public List<Habitacion> listarHabitacionesDisponibles(LocalDate fecha, int duracion, TipoHabitacion tipo) {
		List<Habitacion> buscarHabitacionesDisponibles = almacenReservas.buscarHabitacionesDisponibles(fecha, duracion);
		List<Habitacion> retorno = new ArrayList<>();
		for (Habitacion habitacion : buscarHabitacionesDisponibles) {
			if (habitacion.getTipo().equals(tipo))
				retorno.add(habitacion);
		}
		return retorno;
	}

	public void agregarCliente(String DNI, String datos) {
		Cliente cliente = new Cliente(DNI, datos);
		almacenClientes.agregarCliente(cliente);
	}

	public Reserva agregarReserva(Cliente cliente, LocalDate fechaEntrada, int duracionEnDias,
			TipoHabitacion tipoHabitacion) {
		List<Habitacion> listarHabitacionesDisponibles = listarHabitacionesDisponibles(fechaEntrada, duracionEnDias,
				tipoHabitacion);
		if (!listarHabitacionesDisponibles.isEmpty()) {
			Reserva reserva = new Reserva(almacenReservas.getNextId(), fechaEntrada, duracionEnDias, cliente,
					listarHabitacionesDisponibles.get(0));
			almacenReservas.agregarReserva(reserva);
			return reserva;
		}
		return null;
	}
}
