package funcionario;

public class RodarAplicacao {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		// upcasting

		Funcionario gerente = new Gerente();
		Funcionario faxineiro = new Faxineiro();
		Funcionario vendedor = new Vendedor();

		// downCasting
		// Vendedor vendedor = (Vendedor) new Funcionario();

	}
}
