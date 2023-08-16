package conversor;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversor.operaciones;

public class interfazGrafica extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;
	private JMenuItem opcion6;
	private JMenuItem opcion7;
	private JMenuItem opcion8;
	private JMenuItem opcion9;
	private JMenuItem opcion10;
	private JMenuItem opcionSalir;

	operaciones conversiones = new operaciones();

	public interfazGrafica() {
		setSize(300, 150);
		setLocationRelativeTo(null);
		setTitle("CONVERSOR ONE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		String opciones = (JOptionPane.showInputDialog(
				null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Conversor de Divisas", "----"}, "Seleccion"
				)).toString();		
		
		switch(opciones) {
		case "Conversor de Divisas":
			mostrarMenuDivisas();
		}
		
		panel.add(menuBar);
		add(panel);
		
	}

	public void mostrarMenuDivisas() {
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opción valida");
		opcion1 = new JMenuItem("Pesos (MXN) a Dolares");
		opcion2 = new JMenuItem("Pesos (MXN) a Euros");
		opcion3 = new JMenuItem("Pesos (MXN) a Libra Esterlina");
		opcion4 = new JMenuItem("Pesos (MXN) a Yen Japonés");
		opcion5 = new JMenuItem("Pesos (MXN) a Won sul-coreano");
		opcion6 = new JMenuItem("Dolares a Pesos (MXN)");
		opcion7 = new JMenuItem("Euros a Pesos (MXN)");
		opcion8 = new JMenuItem("Libra Esterlina a Pesos (MXN)");
		opcion9 = new JMenuItem("Yen Japonés a Pesos (MXN)");
		opcion10 = new JMenuItem("Won sul-coreano a Pesos (MXN)");
		opcionSalir = new JMenuItem("Salir");

		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menu.add(opcion4);
		menu.add(opcion5);
		menu.add(opcion6);
		menu.add(opcion7);
		menu.add(opcion8);
		menu.add(opcion9);
		menu.add(opcion10);
		menu.add(opcionSalir);

		menuBar.add(menu);

		opcion1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(0.059, "Pesos", "Dolares");
			}
		});

		opcion2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(0.054, "Pesos", "Euros");
			}
		});

		opcion3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(0.046, "Pesos", "Libra Esterlina");
			}
		});
		
		opcion4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(8.49, "Pesos", "Yen Japonés");
			}
		});
		
		opcion5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(78.12, "Pesos", "Won sul-coreano");
			}
		});	
		
		opcion6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(17.13, "Dolares", "Pesos");
			}
		});

		opcion7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(18.69, "Euros", "Pesos");
			}
		});

		opcion8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(21.76, "Libra Esterlina", "Pesos");
			}
		});
		
		opcion9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(0.12, "Yen Japonés", "Pesos");
			}
		});
		
		opcion10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conversiones.funcionConversion(0.013, "Won sul-coreano", "Pesos");
			}
		});	
		
		opcionSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saliendo...");
				System.exit(0);
			}
		});
	}
	

}