import java.util.Scanner;

/**
 * 
 */

/**
 * @author Fran Garrido
 *
 */
public class Ej1_GarridoBaena_FranciscoM{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float peso, altura, IMC;
		String diagnostico;
		System.out.println("Introduzca el peso: ");
		peso = entrada.nextFloat();
		System.out.println("Introduzca la altura: ");
		altura = entrada.nextFloat();
		IMC = peso/(altura*altura);
		
		if (IMC <= 18.5)
			diagnostico = "bajo peso";
		else if (IMC > 18.5 && IMC <= 24.9)
			diagnostico = "peso normal (saludable)";
		else if (IMC >= 25 && IMC <= 29.9)
			diagnostico = "sobrepeso";
		else if (IMC >= 30 & IMC <= 40)
			diagnostico = "obesidad premórbida";
		else
			diagnostico = "obesidad mórbidad";
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
				 + "\ny tiene un diagnóstico de %s", peso, altura, IMC, diagnostico);
		entrada.close();
	}
	

}
