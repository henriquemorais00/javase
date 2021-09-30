/**
 * POO2 Encapsulamento
 * @author henrique.mteixera
 *
 */
package contas;

public class Conta {
	private double saldo;
	private String cliente;

	/**
	 * obter saldo
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
		/**
		 * atribuir um valor a variavel saldo
		 * 
		 * @param saldo
		 */
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agencia 0261");
	}

	/**
	 * exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: $ " + saldo);
	}

	/**
	 * debitar valor da conta
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
	}

	/**
	 * depositar valor na conta
	 * 
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("depositado: " + valor);
	}

	/**
	 * transferir valor da conta
	 * 
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transfêrencia: R$ " + valor);

	}
}