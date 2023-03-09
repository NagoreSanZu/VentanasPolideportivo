package modelo;


public class Usuario {
	//atributos relacionados con campos
	
		//atributos relacionados con relaciones
		
		//metodos, getters y setters

	private  int id;
	private  String nombreApellido;
	private  String dni;
	private String  codigo;
	
	//getter y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreApellido=" + nombreApellido + ", dni=" + dni + ", codigo=" + codigo + "]";
	}
	
	public void Usuario() {
		
	}
	
	public void Usuario(int id, String NombreApellido, String dni,  String codigo) {
		this.id=id;
		this.nombreApellido=nombreApellido;
		this.dni=dni;
		this.codigo=codigo;
	}
	
}
