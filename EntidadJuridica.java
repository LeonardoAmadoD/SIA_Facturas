
public class EntidadJuridica {
	int codigo;
	String nombre;
	Long ruc;
	int telefono;
	String email;
	
	public EntidadJuridica(int codigo, String nombre, Long ruc, int telefono, String email) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ruc = ruc;
		this.telefono = telefono;
		this.email = email;
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
	
}
