import java.util.Scanner;

public class VerificacaoEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto = scanner.nextLine();
        int quantidadeEstoque = scanner.nextInt();

        // Criação da entidade Produto
        Produto produto = new Produto(nomeProduto, quantidadeEstoque);

        // Criação e execução da estratégia de verificação de estoque
        EstoqueStrategy estoqueStrategy = new VerificarEstoqueStrategy(); 
        String resultado = estoqueStrategy.verificar(produto);

        System.out.println(resultado);

        scanner.close();
    }

}
