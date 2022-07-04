
public class Producto {
	int codigo;
	String descripcion;
	float precio;
	Moneda moneda;
	
	public Producto(int codigo, String descripcion, float precio, Moneda moneda) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.moneda = moneda;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public Moneda getMoneda() {
		return this.moneda;
	}

    @Override
    public String toString() {
        return codigo + "\t" + descripcion + "\t" + precio + " " + moneda.getDescripcion();
    }

}
