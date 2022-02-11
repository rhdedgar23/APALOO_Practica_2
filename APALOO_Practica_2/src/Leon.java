/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Leon que hereda de la clase
  AnimalSalvaje, con su constructor no vacio y sus getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Leon extends AnimalSalvaje{
	
	public Leon(String tipo, String nombre, String localidad) {//constructor que inicializa un nuevo objeto Leon con los parametros tipo, nombre y localidad
		super(tipo, nombre, localidad);
	}
	
	public String ruge() {//metodo-funcion que regresa el string ruge
		return "ruge";
	}
	
	public String desgarra() {//metodo-funcion que regresa el string desgarra
		return "desgarra";
	}
	
	public String caza() {//metodo-funcion que regresa el string caza
		return "caza";
	}
	
	public String come() {//sobreescribimos el metodo-funcion come(), que se encuentra en la superclase Animal y que regresa el string "come", para que regrese el string "come cebras"
		super.come();
		return "come cebras";
	}
}
