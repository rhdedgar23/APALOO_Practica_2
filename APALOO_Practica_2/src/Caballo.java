/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Caballo que hereda de la clase
  AnimalDomestico, con su constructor no vacio y sus getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Caballo extends AnimalDomestico {
	
	public Caballo(String tipo, String nombre, String nombrePropio){//constructor que incializa un nuevo objeto de la clase Caballo, sublcase de la superclase AnimalSalvaje, con los parametros tipo, nombre
		super(tipo, nombre, nombrePropio);//y localidad
	}
	
	public String trota() {//metodo-funcion que regresa el string trota
		return "trota";
	}
	
	public String relincha() {//metodo-funcion que regresa el string relincha
		return "relincha";
	}
	
	public String come() {//sobrescribimos el metodo-funcion come(), que se encuentra en la clase Animal y que regresa el string "come", para que regrese el string "come hierba" 
		super.come();
		return "come hierba";
	}
}
