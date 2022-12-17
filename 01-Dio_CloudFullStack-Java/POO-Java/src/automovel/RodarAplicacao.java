package clairton.projetos.java;

public class RodarAplicacao {

	public static void main(String[] args, int capacidadeTanque) {
		Carro carro1 = new Carro();

		carro1.setCor("Azul");
		carro1.setModelo("BMW");
		carro1.setcapacidadeTanque(59);

		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		// double valorCombustivel;
		// System.out.println(carro1.totalValorTanque(valorCombustivel= 6.39));

		/*
		 * String cor; String modelo; Carro carro2 = new Carro(cor="Cinza", modelo=
		 * "Palio", capacidadeTanque= 66);
		 * 
		 * System.out.println(carro2.getModelo()); System.out.println(carro2.getCor());
		 * System.out.println(carro2.getCapacidadeTanque());
		 * System.out.println(carro2.totalValorTanque(valorCombustivel= 6.46));
		 */
	}

}
