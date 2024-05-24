package modelo.almacenes;

import java.util.List;

import modelo.data.Cliente;
import modelo.objectmother.ClienteOM;

public class AlmacenClientes {
	private List<Cliente> clientes;

	public AlmacenClientes(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Cliente buscarCliente(String dNI) {
		for (Cliente cliente : clientes) {
			if(cliente.isEqualDNI(dNI))
				return cliente;
		}
		return null;
	}
	
	
	
}
