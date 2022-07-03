import java.time.LocalDate;

public class Factura {
	static int cod = 1;
	int cod_factura;
	LocalDate emision;
	Empresa empresa;
	Cliente cliente;
	ProductoFactura [] productos;
	Moneda moneda;
	float valorVenta;
	float igv;
	float precioVenta;
	
	public Factura(Empresa empresa, Cliente cliente, ProductoFactura[] productos) {
		this.cod_factura = 10000 + Factura.cod;
		this.emision = LocalDate.now();
		this.empresa = empresa;
		this.cliente = cliente;
		this.productos = productos;
		this.moneda = this.setMoneda();
		this.valorVenta = this.setValorVenta();
		this.igv = this.setIgv();
		this.precioVenta = this.setPrecioVenta();
		Factura.cod += 1;
	}

	public float getValorVenta() {
		return this.valorVenta;
	}

	public float setValorVenta() {
		float vv = 0;
		for(ProductoFactura p : this.productos) {
			vv += (p.getProducto().getPrecio() * p.getUnidades());
		}
		return vv;
	}

	public float getIgv() {
		return this.igv;
	}

	public float setIgv() {
		return this.valorVenta * 0.18f;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	public float setPrecioVenta() {
		return this.valorVenta + this.igv;
	}

	public int getCod_factura() {
		return this.cod_factura;
	}

	public LocalDate getEmision() {
		return this.emision;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public ProductoFactura[] getProductos() {
		return this.productos;
	}

	public Moneda getMoneda() {
		return this.moneda;
	}

	public Moneda setMoneda() {
		return this.productos[0].getProducto().getMoneda();
	}

	@Override
	public String toString() {
		String str = "\n";
		str += "|####################################\n";
		str += "|- \t" + this.empresa.getNombre() + "\t -\n";
		str += "|- \t" + this.empresa.getRUC() + "\t -\n";
		str += "|Codigo: " + this.cod_factura + "\n";
		str += "|Emision: " + this.emision + "\n";
		str += "|Cliente: " + this.cliente.getNombre() + "\n";
		str += "|RUC: " + this.cliente.getRUC() + "\n";
		str += "|Moneda: " + this.moneda.getDescripcion() + "\n";
		str += "|____________________________________\n";
		str += "|Producto \tU \tPrecio\n";
		str += "|------------------------------------\n";
		for (ProductoFactura p : productos) {
			if(p != null)
				str += "|" + p.getProducto().getDescripcion() + "\t" + p.getUnidades() + "\t" + (p.getProducto().getPrecio() * p.getUnidades()) + "\n";
		}
		str += "|____________________________________\n";
		str += "|Valor de Venta: \t" + this.moneda.getSimbolo() + this.valorVenta + "\n"; 
		str += "|IGV: \t \t \t" + this.moneda.getSimbolo() +  this.igv + "\n";
		str += "|Precio de Venta: \t" + this.moneda.getSimbolo() +  this.precioVenta + "\n";
		str += "|####################################\n";
		return str;
	}

}
