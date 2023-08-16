package conversor;

import javax.swing.JOptionPane;

public class operaciones {

	public double inputNumero;
	public double resultado;

	public double convertir(double unidadOrigen, double factorConversion) {
		return unidadOrigen * factorConversion;
	}

	public void funcionConversion(double factorConversion, String uOrigen, String uDeseada) {
		String input = JOptionPane.showInputDialog("Ingresa los " + uOrigen + " que deseas convertir a " + uDeseada);

		try {
			inputNumero = Double.parseDouble(input);
			resultado = convertir(inputNumero, factorConversion);
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " " + uDeseada);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Cantidad no valida");
		}

	}

}