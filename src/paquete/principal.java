package paquete;
import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0; //variable para el menu
		int div = 0; //variable guarda el residuo de la division
		int dni = 0; //variable guarda el dni
		int x = 0; //variable guarda minimo
		int y = 0; //variable guarda maximo
		int aux = 0; //guarda la opcion en el ejercicio DNI

		do {
			System.out.println("Elija una opcion:");
			System.out.println("1: Ejercicio DNI");
			System.out.println("2: Ejercicio numero aleatorio");
			System.out.println("3: Salir");
			Scanner sc2 = new Scanner(System.in);
			op = sc2.nextInt();
			switch (op) {
			
				case 1:
					do {
					System.out.println("Ingrese el DNI: ");
					try {
						Scanner sc = new Scanner(System.in);
						dni = sc.nextInt();
						
					} catch (Exception e) {
						System.out.println("Dato no valido");
					}
					
					String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
					
					if (dni > 0 && dni <= 99999999)
					{
						div = dni % 23;
						System.out.println("La letra de su DNI es: " + letras[div]);
					}
					
					System.out.println("Ingrese 1 para calcular otro DNI o 2 para cancelar: ");
					Scanner sc5 = new Scanner(System.in);
					aux = sc5.nextInt();
					
					} while (aux != 2);
					break;
					
				case 2:
					System.out.println("Ingrese el valor minimo:");
					Scanner sc3 = new Scanner(System.in);
					x = sc3.nextInt();
					
					System.out.println("Ingrese el valor maximo:");
					Scanner sc4 = new Scanner(System.in);
					y = sc4.nextInt();
					
					num_random(x,y);
					
					break;
			
			}//fin switch
			
		} while (op != 3);
		
		
		
	} // fin main
	

	static int num_random(int x, int y) { //x es minimo -- y es maximo
		
		Random r = new Random();
		int res = r.nextInt(y - x) + x;
		System.out.println(res);
		return res;
		
	}
	

}// fin principal
