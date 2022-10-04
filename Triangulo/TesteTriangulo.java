package aulaExercicios;

import javax.swing.JOptionPane;

public class TesteTriangulo {
	
	float base;
	float altura;
	
	TesteTriangulo (float base, float altura ){
		this.base = base;
		this.altura = altura;
		
	}
	
	void imprimeDados() {
		JOptionPane.showMessageDialog(null,"Dados do trinagulo: "
				+ "\nBase: "+ base +
				"\nAltura: "+altura+
				 "\nÁrea: "+(base*altura)/2);
	}

	
		
	

}
