
public class Empresa extends EntidadJuridica {
	String razonSocial;

	public Empresa(int codigo, String nombre, String razonSocial, Long ruc, int telefono, String email, String direccion) {
		super(codigo, nombre, ruc, telefono, email, direccion);
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

        @Override
        public String toString() {
            return "RazonSocial: " + razonSocial + "\nRUC: " + this.ruc + "\te-mail: " + this.email + "\nTelefono: " + this.telefono + "\tDireccion: " + this.direccion;
        }
}
