
// Classe Transacao representa a entidade do domínio

import java.util.List;

public class Transacao {

    private List<Double> transacoes;

    public Transacao(List<Double> transacoes) {
        this.transacoes = transacoes;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

}
