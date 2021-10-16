package ec.edu.espol.workshops;

public class CarInsurance {
    private String estado_civil;
    private String sexo;
    private int edad;
    private String permiso;
    private int base_price = 500;
    
    /* Getter */
	public String getEstado_civil() {
		return this.estado_civil;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getPermiso() {
		return this.permiso;
	}
	
	public int getBase_price() {
		return this.base_price;
	}
	
	/* Setter */
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}
	
	public void setBase_price(int new_price) {
		this.base_price = this.base_price + new_price;
	}
}
