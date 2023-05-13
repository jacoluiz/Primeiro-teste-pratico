package models;

public class Telefone {
	// O padrão utilizado para escrita de variáveis no Java é o CamelCase. A
	// variável abaixo está em snake_case apenas porque estava escrita assim no
	// documento que me foi compartilhado.
	private String numero_linha;
	private int saldo;

	public Telefone(String numero_linha, int saldo) {
		this.numero_linha = numero_linha;
		this.saldo = saldo;
	}

	public void setNumeroLinha(String numero_linha) {
		this.numero_linha = numero_linha;
	}

	public String getNumeroLinha() {
		return this.numero_linha;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void recarregar(int vlRecarga, Conta conta) {
		this.saldo += vlRecarga;
		conta.debitar(vlRecarga);
	}
}
