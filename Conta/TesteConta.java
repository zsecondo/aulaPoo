package aulaExercicio3;

import javax.swing.JOptionPane;

public class TesteConta {
	public static void main(String[] args) {
		Conta c;
		String nome;
		float saldo, limite, valordep, sacardep, emprestimodep;
		nome = JOptionPane.showInputDialog("Digite o Nome: ");
		saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o Saldo: "));
		limite = 300;
		valordep = 0;
		sacardep = 0;
		emprestimodep = 0;
		c = new Conta(nome, saldo, limite, valordep, sacardep, emprestimodep);
		c.ImprimeDados();
		
		valordep = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
		c.depositar (valordep);
		c.ImprimeDados();
		sacardep = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
		
		c.sacar(sacardep);
		c.ImprimeDados();
		emprestimodep = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja fazer de emprestimo: "));
			if (emprestimodep > limite) {

			JOptionPane.showMessageDialog(null,"Você não tem esse limite de saque!!");
			}
			else {
			c.emprestimo(emprestimodep);
			c.correcao(emprestimodep);
			
			c.ImprimeDados();
			
		}
				
				
	
			
				
		
	}
	
}
