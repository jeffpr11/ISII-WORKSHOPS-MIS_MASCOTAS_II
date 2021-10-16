package ec.edu.espol.workshops;

public class CarInsurance {
	 private String estado_civil;
	 private String sexo;
	 private int edad;
	 private String permiso;
	 
	 private int base_price = 500;
	 
	// Getter
	 public String get_estado_civil() {
		 return this.estado_civil;
	 }

	 public String get_sexo() {
		 return this.sexo;
	 }
	 
	 public int get_edad() {
		 return this.edad;
	 }
	 
	 public String get_permiso() {
		 return this.permiso;
	 }
	 
	 public int get_base_price() {
		 return this.base_price;
	 }
	 
	  // Setter
	 public void set_estado_civil(String estado_civil) {
		 this.estado_civil = estado_civil;
	 }

	 public void set_sexo(String sexo) {
		 this.sexo = sexo;
	 }
	 
	 public void set_edad(int edad) {
		 this.edad = edad;
	 }
	 
	 public void set_permiso(String permiso) {
		 this.permiso = permiso;
	 }
	 
	 public void set_base_price(int new_price) {
		 this.base_price = this.base_price + new_price;
	 }
}
