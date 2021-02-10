package sockets4;

import java.io.Serializable;

public class Mensaje implements Serializable {
	
	public static enum Type {
		INFORMACION,
		COORDENADAS
	}
	
	private Type tipo;
	private String descripcion;
	
	public Mensaje(Type tipo, String descripcion) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Mensaje [tipo=" + tipo + ", descripcion=" + descripcion + "]";
	}
	
}
