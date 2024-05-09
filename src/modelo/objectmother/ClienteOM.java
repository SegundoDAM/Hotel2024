package modelo.objectmother;

import java.util.ArrayList;
import java.util.List;

import modelo.data.Cliente;

public abstract class ClienteOM {
	
	public static List<Cliente> crearColeccionClientes(int cantidadClientes) {
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 1; i <= cantidadClientes; i++) {
            String DNI = "DNI" + i;
            String datosPersonales = "Datos del cliente " + i;
            Cliente cliente = new Cliente(DNI, datosPersonales);
            cliente.setHabitual(i % 2 == 0); // Establecer si el cliente es habitual de manera alterna
            clientes.add(cliente);
        }

        return clientes;
    }
}
