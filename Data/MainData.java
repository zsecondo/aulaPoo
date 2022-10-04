package aulaExercicios2;

import javax.swing.JOptionPane;

public class MainData {

	public static void main(String[] args) {
		Data d;
		int dia, mes, ano;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano:"));
		
		d = new Data(dia, mes, ano);
		d.imprimeDados2();
		
		

	}
	
	
	
}
