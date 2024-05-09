package modelo.objectmother;

import java.util.ArrayList;
import java.util.List;

import modelo.data.Habitacion;
import modelo.data.TipoHabitacion;

public abstract class HabitacionOM {
	public static List<Habitacion> crearColeccionHabitaciones(int cantidadHabitaciones) {
        List<Habitacion> habitaciones = new ArrayList<>();

        for (int i = 1; i <= cantidadHabitaciones; i++) {
            TipoHabitacion tipo = null;
            switch (i % 3) {
                case 0:
                    tipo = TipoHabitacion.normal;
                    break;
                case 1:
                    tipo = TipoHabitacion.doble;
                    break;
                case 2:
                    tipo = TipoHabitacion.matrimonial;
                    break;
            }
            String datosHabitacion = "Datos de la habitación " + i;
            Habitacion habitacion = new Habitacion(datosHabitacion, i, tipo);
            habitaciones.add(habitacion);
        }

        return habitaciones;
    }

}
