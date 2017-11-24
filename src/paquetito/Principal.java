package paquetito;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sca = new Scanner(System.in);
		 	float altura;
		 	float peso;
		 	float Imc;
			System.out.println("Dime tu altura");
			altura=sca.nextFloat();
			System.out.println("Dime tu peso");
			peso=sca.nextFloat();
			Imc = peso/(altura*altura);
			if ((peso<0||peso>90)||(altura<0||altura>2.5)){
				System.out.println("Introduce valores correctos");
			}else{
				System.out.println("Su Imc; "+Imc+" indica que Ud. se encuentra: ");
				if (Imc<17){
					System.out.println("Muy por debajo del peso adecuado");
				}else if (Imc>=17 && Imc<18){
					System.out.println("Por debajo del peso adecuado");
				}else if (Imc>=18 && Imc<26){
					System.out.println("En el peso ideal");
				}else if (Imc>=26 && Imc<30){
					System.out.println("Con sobrepeso de grado 1");
				}else if (Imc>=30 && Imc<35){
					System.out.println("Con sobrepeso de grado 2");
				}else if (Imc>=35 && Imc<40){
					System.out.println("Con sobrepeso de grado 3");
				}else {
					System.out.println("Con sobrepeso de grado 4");
				}
			}
	
	}
}
