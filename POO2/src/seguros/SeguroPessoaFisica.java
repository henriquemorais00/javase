package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Diego Teruel");
		cc3.setSaldo(9000);
		System.out.println("Cliente " + cc3.getCliente());
		cc3.exibirSaldo();
		cc3.depositar(2500);
		cc3.exibirSaldo();
	}
}
