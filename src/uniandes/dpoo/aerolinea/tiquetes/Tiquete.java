package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	public Tiquete(String codigo,  Vuelo vuelo, Cliente cliente, int tarifa) {
		
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = false;
		this.vuelo = vuelo;
		this.cliente = cliente;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public boolean esUsado() {
		return usado;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public void marcarComoUsado() {
		this.usado = true;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
