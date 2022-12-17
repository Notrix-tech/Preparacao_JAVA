
public class Carro extends Veiculo {
	String cor;
	String modelo;
	int capacidadeTanque;

	// construtor fica aqui para criar objetos

	Carro() {

	}

	Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setcapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque = valorCombustivel;
	}

}
