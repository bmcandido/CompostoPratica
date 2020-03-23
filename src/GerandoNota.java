
public class GerandoNota {

	public static void main(String[] args) {
		// Gerando Nota Fiscal

		// Cadastro do Produto
		CadastroProduto produto = new CadastroProduto();
		produto.codigo = 123;
		// produto.descricao = "Produto 1";

		// Cadastro do Cliente
		CadastroCliente bruno = new CadastroCliente();
		bruno.codigo = 1;
		bruno.cidade = "Goiania";
		bruno.cpf = "009.736.851.23";
		bruno.nome = "Bruno Mario Candido de Macedo";

		// Estoque

		Estoque EstoqueUm = new Estoque();

		EstoqueUm.codigo = produto;

		// System.out.println(produto.codigo); //Imprimindo produto do estoque
		// System.out.println(EstoqueUm.codigo.codigo); //Ligadooossssssssssssssssssss

		EstoqueUm.saldo = 200;

		// Nota Fiscal

		CabecalhoNota NotaUm = new CabecalhoNota(); // Cabeçalho da Nota

		NotaUm.numeronota = 1;
		NotaUm.codigo = bruno;

		System.out.println("Nome :" + NotaUm.codigo.nome);
		System.out.println("CPF :" + NotaUm.codigo.cpf); // Esta Trazendo o CPF pois ouve o Vinculo ao Codigo do Cliente

		Item Itemum = new Item();
		NotaUm.origem = 1;

        Itemum.quantidade=30;


		Itemum.numeroNota = NotaUm; // Ligando o Cabeçalho ao Item da Nota
		Itemum.codigo = produto; // Ligando ao Produto

		Itemum.valor = Itemum.quantidade * Itemum.quantidade;
		System.out.println(Itemum.valor);
		System.out.println("Saldo Antes da Saida :" + EstoqueUm.saldo);
		
		EstoqueUm.Calcula(Itemum.quantidade,NotaUm.origem);

		System.out.println("Saldo Depois da Saida :" + EstoqueUm.saldo);
	


	}

}
