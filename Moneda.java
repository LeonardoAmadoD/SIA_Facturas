
public class Moneda {
	int codigo;
	String descripcion;
	String simbolo;
	
	public Moneda(int codigo, String descripcion, String simbolo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.simbolo = simbolo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public String getSimbolo() {
		return this.simbolo;
	}
		
}
