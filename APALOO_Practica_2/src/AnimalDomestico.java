/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase AnimalDomestico que hereda de la clase
  Animal, con su constructor no vacio y sus getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class AnimalDomestico extends Animal {
	
	private String nombrePropio;//variable de instancia
	
	public AnimalDomestico(String tipo, String nombre, String nombrePropio) {//constructor que extiende a la clase Animal. Inicializa un objeto nuevo con el tipo y nombre correspondiente a la clase Animal
		super(tipo, nombre);//e inicializa el nombrePropio
		this.nombrePropio= nombrePropio;
	}
	
	public void setNombrePropio(String nombrePropio) {//metodo - procedimiento que asigna nombrePropio
		this.nombrePropio= nombrePropio;
	}
	
	public String getNombrePropio() {//metodo - funcion que regresa el valor de la variable nombrePropio
		return nombrePropio;
	}
}