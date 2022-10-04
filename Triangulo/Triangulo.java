package aulaExercicios;

import javax.swing.JOptionPane;

public class Triangulo {
	
	public static void main(String[] args) {
		
		TesteTriangulo t;
		float base, altura;
		base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo"));
		
		t = new TesteTriangulo(base, altura);
		t.imprimeDados();
		
	}
	
}
		
		
	
		
	
	
	
	  
	
	
	

