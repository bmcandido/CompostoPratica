
public class Estoque {
	CadastroProduto codigo;
	double saldo;
	String descricao;
	int tipo;
	double entrada;
	double saida;

	// Entrada / Saida

	public void Calcula(double valor, int segundo) {
		if (segundo < 0) {
			valor = valor * -1;

		}

		if (valor > 0) {

			this.saldo += valor;
			this.entrada = valor;

		} else {
			valor = valor * -1;
			this.saldo -= valor;
			this.saida = valor;
		}

	}

}