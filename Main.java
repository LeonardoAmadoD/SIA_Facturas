
public class Main {
		
	public static void main(String[] args) {
		Empresa e1 = new Empresa(101, "Empresa x", 10325778491L, 921969057, "contacto@empresaX.com");
		Cliente c1 = new Cliente(301, "Cliente x", 10145874575L, 967522091, "cliente@gmail.com");
		Moneda m1 = new Moneda(401, "Nuevo Sol", "S/.");
		//
		Producto p1 = new Producto(801, "Producto 1", 20, m1);
		Producto p2 = new Producto(802, "Producto 2", 50, m1);
		Producto p3 = new Producto(803, "Producto 3", 47, m1);
		Producto p4 = new Producto(804, "Producto 4", 69, m1);
		Producto p5 = new Producto(805, "Producto 5", 250, m1);
		Producto p6 = new Producto(806, "Producto 6", 345, m1);
		Producto p7 = new Producto(807, "Producto 7", 124, m1);
		Producto p8 = new Producto(808, "Producto 8", 70, m1);
		Producto p9 = new Producto(809, "Producto 9", 88, m1);
		Producto p10 = new Producto(810, "Producto 10", 100, m1);
		//
		//
		ProductoFactura [] pf1 = {new ProductoFactura(p1,4),new ProductoFactura(p3,7),new ProductoFactura(p6,8)};
		ProductoFactura [] pf2 = {new ProductoFactura(p1,2),new ProductoFactura(p5,1),new ProductoFactura(p9,8),new ProductoFactura(p10,4)};
		ProductoFactura [] pf3 = {new ProductoFactura(p2,11)};
		ProductoFactura [] pf4 = {new ProductoFactura(p4,6),new ProductoFactura(p7,4)};
		ProductoFactura [] pf5 = {new ProductoFactura(p9,3)};
		//
		//
		Factura [] facturas = {
				new Factura(e1, c1, pf1),
				new Factura(e1, c1, pf2),
				new Factura(e1, c1, pf3),
				new Factura(e1, c1, pf4),
				new Factura(e1, c1, pf5)
		};
		
		for(Factura f : facturas)
			System.out.println(f);
			
	}

}
