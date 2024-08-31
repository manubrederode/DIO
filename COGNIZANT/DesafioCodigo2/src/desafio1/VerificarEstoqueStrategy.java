
public class VerificarEstoqueStrategy implements EstoqueStrategy {

    // Constante que define o limite mínimo de estoque
    private static final int LIMITE_MINIMO_ESTOQUE = 10;

   @Override
    public String verificar(Produto produto) {
        int quantidadeEstoque = produto.getQuantidadeEstoque();
        String nomeProduto = produto.getNome();


        if (quantidadeEstoque < LIMITE_MINIMO_ESTOQUE) {
            return "Alerta: Estoque baixo de " + nomeProduto;
        } else {
            return "Estoque de " + nomeProduto + " esta em nivel adequado";
        }
    }

}
