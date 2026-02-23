package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	protected String identificador;
	protected List<Tiquete> tiquetesSinUsar;
    protected List<Tiquete> tiquetesUsados;
	
	
    public Cliente(String identificador) {
        this.identificador = identificador;
        this.tiquetesSinUsar = new ArrayList<>();
        this.tiquetesUsados = new ArrayList<>();
    }


	public abstract String getTipoCliente();
	
	public String getIdentificador() {
        return identificador;
    }
	
	public void agregarTiquete(Tiquete tiquete) {
        this.tiquetesSinUsar.add(tiquete);
    }

    public int calcularValorTotalTiquetes() {
        int total = 0;
        for (Tiquete t : tiquetesSinUsar) {
            total += t.getTarifa();
        }
        for (Tiquete t : tiquetesUsados) {
            total += t.getTarifa();
        }
        return total;
    }

    public void usarTiquete(Vuelo vuelo) {
        Tiquete aUsar = null;
        for (Tiquete t : tiquetesSinUsar) {
            if (t.getVuelo().equals(vuelo)) {
                aUsar = t;
                break;
            }
        }
        if (aUsar != null) {
            tiquetesSinUsar.remove(aUsar);
            aUsar.marcarComoUsado();
            tiquetesUsados.add(aUsar);
        }
    }
}
