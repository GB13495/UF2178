/**
 * 
 */

/**
 * @author Fran Garrido
 *
 */
public class Examen {
	
	/**
	 * Método que muestra en pantalla la matriz de los IMCS
	 * @param la matriz que contiene los IMCS
	 */
	
	public static void mostrar_imcs (double m[][]) {
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.printf("%.2f ", m[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Método que calcula la media de IMCS de un paciente
	 * @param la matriz que contiene los IMCS
	 * @param el paciente (fila de la matriz)
	 * @return float la media de IMCS del paciente dado
	 */
	public static double media_paciente(int paciente, double m[][]) {
		double suma = 0, media = 0;
		for (int j = 0; j < m[0].length; j++) {
			suma = suma + m[paciente][j];
		}
		media = suma / m[0].length;
		return media;
	}
}
