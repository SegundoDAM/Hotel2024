package modelo.data;

import java.time.LocalDate;

public class Reserva {
	private Long id;
	private LocalDate fechaEntrada;
	private int estancia;
	private Cliente cliente;
	private Habitacion habitacion;
	
	public Reserva(Long id, LocalDate fechaEntrada, int estancia, Cliente cliente, Habitacion habitacion) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.estancia = estancia;
		this.cliente = cliente;
		this.habitacion = habitacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getEstancia() {
		return estancia;
	}

	public void setEstancia(int estancia) {
		this.estancia = estancia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
}
