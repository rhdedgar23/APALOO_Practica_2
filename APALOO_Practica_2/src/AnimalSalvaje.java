/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase AnimalSalvaje que hereda de la clase
  Animal, con su constructor no vacio y sus getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class AnimalSalvaje extends Animal{
	
	private String localidad;//variable de instancia
	
	public AnimalSalvaje(String tipo, String nombre, String localidad) {//constructor que inicializa un nuevo objeto de la clase Animal con los parametros tipo y nombre
		super(tipo, nombre);//e inicializa la variable de instancia localidad con lo ingresado en el parametro localidad
		this.localidad= localidad;
	}
	
	public void setLocalidad(String localidad){//metodo-procedimiento que asigna el parametro localidad a la variable de instancia localidad
		this.localidad= localidad;
	}
	
	public String getLocalidad() {//metodo-funcion que regresa el valor de la variable de instancia localidad
		return localidad;
	}
}
