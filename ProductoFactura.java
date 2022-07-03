
public class ProductoFactura {
	Producto producto;
	int unidades;
	
	public ProductoFactura(Producto producto, int unidades) {
		this.producto = producto;
		this.unidades = unidades;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public int getUnidades() {
		return this.unidades;
	}

}
