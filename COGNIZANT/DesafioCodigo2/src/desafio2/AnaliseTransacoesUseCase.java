// Classe AnaliseTransacoesUseCase contém a lógica do caso de uso

import java.util.List;

public class AnaliseTransacoesUseCase {

    public String analisar(Transacao transacao) {
        List<Double> transacoes = transacao.getTransacoes();
        double saldoFinal = 0;
        double maiorDeposito = Double.MIN_VALUE;
        double maiorRetirada = Double.MAX_VALUE;

        //Análise das transações:
        for (double valor : transacoes) {
            saldoFinal += valor;
            if (valor > 0 && valor > maiorDeposito) {
                maiorDeposito = valor;
            }
            if (valor < 0 && valor < maiorRetirada) {
                maiorRetirada = valor;
            }
        }

        // Construção do resultado
        StringBuilder resultado = new StringBuilder();
        resultado.append(String.format("Saldo: %.2f\n", saldoFinal));
        resultado.append(String.format("Deposito: %.2f\n", maiorDeposito));
        resultado.append(String.format("Retirada: %.2f\n", maiorRetirada));
        resultado.append(saldoFinal >= 0 ? "Saldo positivo" : "Saldo negativo");
  
        return resultado.toString();
        
    }

}
