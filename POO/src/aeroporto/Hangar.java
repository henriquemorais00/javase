package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = true;
		System.out.println("Aviao: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("envergadura: " + boeing777.envergadura);
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
			if (boeing777.tremPouso == true) {
				boeing777.aterrizar();
			} else {
				System.out.println("ARREMETER!");

			}
			Aviao embraer = new Aviao();
			embraer.ano = 2021;
			embraer.cor = "vermelho";
			embraer.envergadura = 112.17;
			System.out.println("Aviao= embraer");
			System.out.println("cor ;" + embraer.cor);
			System.out.println("Envergadura:" + embraer.envergadura);
			embraer.acelerar();
			embraer.ligar();
			embraer.aterrizar();
		}

	}

}
