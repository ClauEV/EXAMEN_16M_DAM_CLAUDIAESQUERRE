import java.util.Scanner;

public class Examen {
	
	public static void main(String[] arg) {
		
		System.out.println("Hola Ceinmark, soy Claudia Esquerre");
		
		Scanner ent=new Scanner(System.in);
		int numero=0;
		
		System.out.println("Introduce un numero para averiguar si es par o no");
		numero=ent.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero " + numero + " es par");
		}
		else {
			System.out.println("El numero " + numero + " es impar");
		}
		
	}

}
