/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Principal de prueba que instancia cada una
  de las clases Perro, Caballo y Leon e invoca a todos sus 
  metodos. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Nombre, tipo, y caracteristicas de cada animal
  instanciado.
**************************DOCUMENTACION*********************** */

public class Principal {

	public static void main(String[] args) {
		//crea una instancia del perro Fido, caballo Bob, y de un leon
		Perro a1= new Perro("Domestico", "Perro", "Fido");
		Caballo a2= new Caballo("Domestico", "Caballo", "Bob");
		Leon a3= new Leon("Salvaje", "Leon", "Kenya");
		
		//para cada uno de los objetos creads invoca a todos sus metodos
		System.out.println(a1.getNombrePropio() + " es un " + a1.getNombre() + " del tipo animal " + a1.getTipo() + ", " + a1.mueveCola() + ", " + a1.ladra() + ", " + a1.come() + " y " + a1.duerme() + ".");
		System.out.println(a2.getNombrePropio() + " es un " + a2.getNombre() + " del tipo animal " + a2.getTipo() + ", " + a2.trota() + ", " + a2.relincha() + ", " + a2.come() + " y " + a2.duerme() + ".");
		System.out.println("El Leon es del tipo animal " + a3.getTipo() + ", de la localidad " + a3.getLocalidad() + ", " + a3.ruge() + ", " + a3.desgarra() + ", " + a3.caza() + ", " + a3.come() + " y " + a3.duerme() + ".");
	}

}
