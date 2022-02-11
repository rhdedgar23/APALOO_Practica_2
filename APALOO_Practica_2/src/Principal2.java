/* ***********************DOCUMENTACION***********************
- Programa: Practica 2
- Version: Martes 23 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Principal2 que despliega un menu y realiza
  un procedimiento de acuerdo a la opcion ingresada por el usuario
- Datos de entrada: Opcion del menu
- Datos de salida: Notificaciones (i.e. alta de animales), despliega
  la lista de animales; todo dependiendo de la opcion deseada.
**************************DOCUMENTACION*********************** */

import java.util.Scanner;

public class Principal2 {
	
	static int MAX=5, num_perros=0, num_caballos=0, num_leones=0;//variables de clase que pueden ser accesadas por todos los metodos de la clase
	
	static Perro[] Perros= new Perro[MAX];
	static Caballo[] Caballos= new Caballo[MAX];
	static Leon[] Leones= new Leon[MAX];
	
	public static void main(String[] args) {
		desplegarMenu();
		MenuSelect();
	}
	
	public static void desplegarMenu() {//metodo-procedimiento que despliega el menu
		System.out.println("1> Dar de alta leon");
		System.out.println("2> Dar de alta perro");
		System.out.println("3> Dar de alta caballo");
		System.out.println("4> Lista los animales salvajes");
		System.out.println("5> Lista los perros");
		System.out.println("6> Lista los caballos");
		System.out.println("7> Salir");
	}
	
	//metodo-procedimiento que recibe la opcion deseada del menu e inicializa el 
	//procedimiento de dicha opcion
	public static void MenuSelect() {
		try (Scanner lector = new Scanner(System.in)) {
			System.out.println("Por favor ingresa el numero de la opcion deseada: ");
			int opcion= lector.nextInt();//guardamos el int ingresado en la variable opcion
			
			MenuSwitch(opcion);
		}
	}
	
	//metodo-procedimiento que realiza un procedimiento de acuerdo a la opcion del menu
	//pasada como parametro
	public static void MenuSwitch(int opcion) {
		
		try (Scanner lector = new Scanner(System.in)) {
			switch(opcion) {
			case 1:
				System.out.println("Ingresa la localidad del leon que quieres dar de alta: ");
				String localidadLeon= lector.nextLine();
				
				Leon leon_alta= new Leon("Salvaje", "Leon", localidadLeon);
				num_leones= num_leones + 1;
				Leones[num_leones-1]=leon_alta;
				
				System.out.println("Tu Leon ha sido registrado exitosamente.\n");
				desplegarMenu();
				MenuSelect();
				break;
			case 2:
				System.out.println("Ingresa el nombre propio del perro que quieres dar de alta: ");
				String NombrePropioPerro= lector.nextLine();
				
				Perro perro_alta= new Perro("Domestico", "Perro", NombrePropioPerro);
				num_perros= num_perros + 1;
				Perros[num_perros-1]=perro_alta;
				
				System.out.println("Tu perro " + NombrePropioPerro + " ha sido registrado exitosamente.\n");
				desplegarMenu();
				MenuSelect();
				break;
			case 3: 
				System.out.println("Ingresa el nombre propio del caballo que quieres dar de alta: ");
				String NombrePropioCaballo= lector.nextLine();
				
				Caballo caballo_alta= new Caballo("Domestico", "Caballo", NombrePropioCaballo);
				num_caballos= num_caballos + 1;
				Caballos[num_caballos-1]=caballo_alta;
				
				System.out.println("Tu caballo " + NombrePropioCaballo + " ha sido registrado exitosamente.\n");
				desplegarMenu();
				MenuSelect(); 
				break;
			case 4:
				for(int i=0; i<num_leones; i++) {
					int j=i+1;
					System.out.println("El leon " + j + " es de la localidad " + Leones[i].getLocalidad());
				}
				System.out.println("\n");
				desplegarMenu();
				MenuSelect();
				break;
			case 5: 
				for(int i=0; i<num_perros; i++) {
					int j=i+1;
					System.out.println("El perro " + j + " se llama " + Perros[i].getNombrePropio());
				}
				System.out.println("\n");
				desplegarMenu();
				MenuSelect();
				break;
			case 6: 
				for(int i=0; i<num_caballos; i++) {
					int j=i+1;
					System.out.println("El caballo " + j + " se llama " + Caballos[i].getNombrePropio());
				}
				System.out.println("\n");
				desplegarMenu();
				MenuSelect();
				break;
			case 7: 
				System.out.println("Hasta luego!"); 
				System.exit(0);
				break;
			default: 
				System.out.println("ERROR! Por favor ingresa una opcion correcta: ");
				desplegarMenu();
				MenuSelect();
				break;
			}
		}
	}
		
}
