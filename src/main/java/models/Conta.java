package models;

public class Conta {
	private int saldo;
	// O padrão utilizado para escrita de variáveis no Java é o CamelCase. A
	// variável abaixo está em snake_case apenas porque estava escrita assim no
	// documento que me foi compartilhado.
	private int vl_recarga;

	public Conta(int saldo) {
		this.saldo = saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setRecarga(int vl_recarga) {
		this.vl_recarga = vl_recarga;
	}

	public int getRecarga() {
		return this.vl_recarga;
	}

	public void debitar(int vlDebitar) {
		this.saldo -= vlDebitar;
	}

	public void creditar(int vlCreditar) {
		this.saldo += vlCreditar;
	}
}
