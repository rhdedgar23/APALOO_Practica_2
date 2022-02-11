/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Animal con su constructor no vacio y sus
  getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Animal {
	
	private String nombre;//solo esta clase puede usar estos strings ya que son private
	private String tipo;//son variables de instancia
	
	
	public Animal(String tipo, String nombre){
		//este es el constructor no vacio que se pide de cada clase. 
		//Los constructores se construyen poniendo "public" seguido del nombre de la clase (que en este caso es "Animal")
		
		super(); //construye un nuevo objeto de la clase Animal con los siguientes parametros
		this.tipo= tipo;//le asigna el tipo ingresado como parametro a la variable de instancia de aquel objeto creado
		this.nombre= nombre;//lo mismo para nombre
	}
	
	public void setTipo(String tipo) {
		this.tipo= tipo;
	}
	
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String come(){
		return "come";
	}
	
	public String duerme() {
		return "duerme";
	}
}
