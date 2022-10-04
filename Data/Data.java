package aulaExercicios2;

import javax.swing.JOptionPane;

public class Data {
int dia;
int mes;
int ano;

	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
}
	void imprimeDados2() {
		JOptionPane.showMessageDialog(null,"Dados da Data: "
				+ "\nDia: "+ dia+
				"\nMes: "+ mes+
				"\nAno: "+ano);
}

}
