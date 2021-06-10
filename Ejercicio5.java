import java.util.*;
public class Ejercicio5{
	public static void main(String[] args) {
		int ingresar;
		int contmujeres = 0;
		int conthombres = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el numero de edades a registrar");
		ingresar = scan.nextInt();
		for (int i = 0; i < ingresar ; i++ ) {
			int sexo;
			int edad;
			System.out.println("Ingrese el sexo");
			System.out.println("Pulse 1 si es mujer, pulse 2 si es hombre");
			sexo = scan.nextInt();
			if (sexo == 1) {
				System.out.println("Ingrese la edad");
				edad = scan.nextInt();
				if (edad >= 18) {
					contmujeres++;
				}
			} else if (sexo == 2) {
				System.out.println("Ingrese la edad");
				edad = scan.nextInt();
				if (edad < 18) {
					conthombres++;
				}
			} else {
				System.out.println("La opcion que ingreso no es valida");
			}
		}
		System.out.println("Hay " + contmujeres + " mujeres mayores de edad");
		System.out.println("Hay " + conthombres + " hombres menores de edad");
	}
}