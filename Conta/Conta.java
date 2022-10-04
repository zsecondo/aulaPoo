package aulaExercicio3;

import javax.swing.JOptionPane;

public class Conta {
	String nome;
	float saldo, limite, valordep, sacardep, emprestimodep;
		
	Conta (String nome, float saldo, float limite, float valordep, float sacardep, float emprestimodep){
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		this.valordep = valordep;
		this.sacardep = sacardep;
		this.emprestimodep = emprestimodep;
	}
	void ImprimeDados() {
		JOptionPane.showMessageDialog(null, "A conta de: "+nome+
				"\nTem um saldo de: "+saldo
				+"\nE um limite de emprestimo de: "+limite);
	}
	void depositar(float valor) {
		saldo = saldo+valor;
		
}
	void sacar (float sacar) {
		saldo = saldo - sacar;
		
	}
	
	void emprestimo(float emprestimo) {
		saldo = saldo + emprestimo;
	}
	
	void correcao(float emprestimodep) {
		limite = limite - emprestimodep;
	}
}
