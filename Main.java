import java.util.Scanner;
import java.util.ArrayList;

public class Main {
		
	public static void main(String[] args) {
		Empresa e1 = new Empresa(101, "Empresa x", "Empresa x SA",10325778491L, 921969057, "contacto@empresaX.com", "Direccion Empresa");
		Cliente c1 = new Cliente(301, "Cliente x", 10145874575L, 967522091, "cliente@gmail.com", "Direccion Cliente");
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
                
                //Iniciadores
                boolean programRunning = true;
                int cantProd = 10;
                int cantClientes = 1;
                int cantFacturas = 5;
                //
                //
                ArrayList<Producto> productos= new ArrayList();
                productos.add(p1);
                productos.add(p2);
                productos.add(p3);
                productos.add(p4);
                productos.add(p5);
                productos.add(p6);
                productos.add(p7);
                productos.add(p8);
                productos.add(p9);
                productos.add(p10);
                //
                //
                ArrayList<Cliente> clientes = new ArrayList();
                clientes.add(c1);
                //
                //
                ArrayList<Factura> facturas2 = new ArrayList();
                facturas2.add(facturas[0]);
                facturas2.add(facturas[1]);
                facturas2.add(facturas[2]);
                facturas2.add(facturas[3]);
                facturas2.add(facturas[4]);
                
                while (programRunning){
                    System.out.println("---------------------SISTEMA DE FACTURACION---------------------\n");
                    System.out.println("1) Ingresar nuevo producto\n2) Cambiar moneda\n3) Registrar nuevo cliente\n4) Realizar factura\n"
                            + "5) Ver datos de la empresa\n6) Cerrar programa\n");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Por favor ingrese su eleccion: ");
                    String eleccion = sc.nextLine();
                    
                    switch(eleccion){
                        case "1":
                            System.out.print("---------------------NUEVO PRODUCTO---------------------\n");
                            System.out.print("Ingrese el codigo: ");
                            int codProd = sc.nextInt();
                            System.out.print("Ingrese el nombre: ");
                            sc.nextLine();
                            String nombreProd = sc.nextLine();
                            System.out.print("Ingrese el precio: (##,##)");
                            float precioProd = sc.nextFloat();
                            cantProd++;
                            Producto n_producto = new Producto(codProd, nombreProd, precioProd, m1);
                            productos.add(n_producto);
                            System.out.println("Producto registrado!...");
                            break;
                        case "2":
                            System.out.print("---------------------CAMBIAR MONEDA---------------------\n");
                            System.out.print("Ingrese el nombre: ");
                            String nombreMoneda = sc.nextLine();
                            System.out.print("Ingrese el simbolo: ");
                            String simbMoneda = sc.nextLine();
                            m1 = new Moneda(401, nombreMoneda, simbMoneda);
                            System.out.println("Moneda cambiada!...");
                            break;
                        case "3":
                            System.out.print("----------------------REGISTRAR CLIENTE----------------------\n");
                            System.out.print("Ingrese el nombre del cliente: ");
                            String nomCliente = sc.nextLine();
                            System.out.print("Ingrese el RUC: ");
                            String rucCliente = sc.nextLine();
                            System.out.print("Ingrese el telefono: ");
                            String telCliente = sc.nextLine();
                            System.out.print("Ingrese el email: ");
                            String emailCliente = sc.nextLine();
                            System.out.print("Ingrese la dirección fiscal: ");
                            String dirCliente = sc.nextLine();
                            cantClientes++;
                            clientes.add(new Cliente(301 + cantClientes, nomCliente, (long)Integer.getInteger(rucCliente), Integer.getInteger(telCliente), emailCliente, dirCliente));
                            System.out.println("Cliente registrado");
                            break;
                        case "4":
                            System.out.print("----------------------FACTURA----------------------\n");
                            int clienteStr = 0;
                            do{
                                System.out.println("Elejir cliente:");
                                for(int i = 0; i < cantClientes; i++){
                                    System.out.println(i + ") " + clientes.get(i));
                                }
                                clienteStr = sc.nextInt();
                            }while(clienteStr < 0 || clienteStr >= cantClientes);
                            String elijiendoProd = "S";
                            ArrayList<ProductoFactura> factAL = new ArrayList();
                            int cantProdFact = 0;
                            int prodStr = -1;
                            do{
                                do{
                                    System.out.println("Elejir producto:");
                                    for(int i = 0; i < cantProd; i++){
                                        System.out.println(i + ") " + productos.get(i));
                                    }
                                    prodStr = sc.nextInt();
                                }while(prodStr < 0 || prodStr >= cantProd);
                                System.out.println("Elejir la cantidad:");
                                int cantProdStr = sc.nextInt();
                                factAL.add( cantProdFact, new ProductoFactura(productos.get(prodStr), cantProdStr) );
                                cantProdFact++;
                                System.out.println("Desea continuar registrando productos? (S/N)");
                                sc.nextLine();
                                elijiendoProd = sc.nextLine();
                                System.out.print(elijiendoProd);
                            }while (elijiendoProd.equals("S") || elijiendoProd.equals("s"));
                            System.out.println(elijiendoProd);
                            ProductoFactura [] fact = new ProductoFactura [cantProdFact];
                            int i = 0;
                            for(ProductoFactura pc = factAL.get(0); i < cantProdFact; i++){
                                pc = factAL.get(i);
                                fact[i] = pc;
                            }
                            Factura f = new Factura(e1, clientes.remove(clienteStr), fact);
                            cantFacturas++;
                            facturas2.add(f);
                            System.out.println(f);
                            sc.nextLine();
                            break;
                        case "5": 
                            System.out.print("----------------------EMPRESA----------------------\n");
                            System.out.println(e1);
                            System.out.print("---------------------PRODUCTOS---------------------\n");
                            for(int j = 0; j < cantProd; j++){
                                System.out.println(j + ") " + productos.get(j));
                            }
                            System.out.print("---------------------CLIENTES---------------------\n");
                            for(int j = 0; j < cantClientes; j++){
                                System.out.println(j + ") " + clientes.get(j));
                            } 
                            System.out.print("---------------------FACTURAS---------------------\n");
                            for(int j = 0; j < cantFacturas; j++){
                                System.out.println(j + ") " + facturas2.get(j));
                            }
                            sc.nextLine();
                            break;
                        case "6": programRunning = false; System.out.println("Vuelva pronto!"); break;
                        default:
                            System.out.println("\nDebe colocar una eleccion valida\n");
                            break;
                    }
                }
	}

}
