/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Perro que hereda de la clase
  AnimalDomestico, con su constructor no vacio y sus getters y setters. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Perro extends AnimalDomestico{
		
		public Perro(String tipo, String nombre, String nombrePropio) {//constructor que inicializa un nuevo objeto de la clase AnimalDomestico con los parametros tipo, nombre y nombrePropio
			super(tipo, nombre, nombrePropio);
		}
		
		public String ladra(){//metodo-funcion que regresa el string ladra
			return "ladra";
		}
		
		public String mueveCola() {//metodo-funcion que regresa el string "mueve la cola"
			return "mueve la cola";
		}
		
		public String come() {//reescribimos el metodo-funcion come() que regresa el string "come" para que regrese "come croquetas" como esta en la subclase, tendra prioridad
			super.come();
			return "come croquetas";
		}
}
