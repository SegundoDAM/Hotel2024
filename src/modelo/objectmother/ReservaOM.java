package modelo.objectmother;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.data.Cliente;
import modelo.data.Habitacion;
import modelo.data.Reserva;

public class ReservaOM {
	 public static List<Reserva> crearColeccionReservas( List<Cliente> clientes) {
	        List<Reserva> reservas = new ArrayList<>();
	        List<Habitacion> habitaciones=HabitacionOM.crearColeccionHabitaciones(10);
	        // Suponiendo que se realiza una reserva por cada cliente para una habitación
	        for (int i = 0; i < clientes.size(); i++) {
	            LocalDate fechaEntrada = LocalDate.now().plusDays(i); // Fechas de entrada diferentes para cada reserva
	            int estancia = (i % 5) + 1; // Duración de la estancia variable
	            Cliente cliente = clientes.get(i);
	            Habitacion habitacion = habitaciones.get(i % habitaciones.size()); // Asignar habitaciones de manera circular
	            Reserva reserva = new Reserva((long) (i + 1), fechaEntrada, estancia, cliente, habitacion);
	            reservas.add(reserva);
	        }

	        return reservas;
	    }
}
