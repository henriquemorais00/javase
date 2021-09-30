package contas;

public class PessoaFisica {
	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Henrique Teixeira");
		cc1.setSaldo(7000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1587);
		cc1.exibirSaldo();
		cc1.depositar(680);
		cc1.exibirSaldo();
		System.out.println("----------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Gabriel Santana");
		cc2.setSaldo(5000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(293);
		cc2.exibirSaldo();
		cc2.depositar(987);
		cc2.exibirSaldo();
		System.out.println("----------------------");

		System.out.println("Transferencia");
		cc2.transferir(cc1, 2000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("Favorecido: " + cc1.getCliente());
		cc1.exibirSaldo();

	}

}
