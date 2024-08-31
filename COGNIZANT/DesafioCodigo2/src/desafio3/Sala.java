// Entidade Sala representa a entidade do domínio
public class Sala {

    private int numero;
    private int temperatura;

    public Sala(int numero, int temperatura) {
        this.numero = numero;
        this.temperatura = temperatura;
    }

    public int getNumero() {
        return numero;
    }

    public int getTemperatura() {
        return temperatura;
    }

}
