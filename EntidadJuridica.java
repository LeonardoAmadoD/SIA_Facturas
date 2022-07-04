
public class EntidadJuridica {
	int codigo;
	String nombre;
	Long ruc;
	int telefono;
	String email;
	String direccion;
	
	public EntidadJuridica(int codigo, String nombre, Long ruc, int telefono, String email, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ruc = ruc;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public Long getRUC() {
		return this.ruc;
	}

	public String getDireccion() {
		return direccion;
	}

    @Override
    public String toString() {
        return nombre + "\t" + ruc + "\t" + telefono + "\t" + email + "\t" + direccion;
    }
	
}
