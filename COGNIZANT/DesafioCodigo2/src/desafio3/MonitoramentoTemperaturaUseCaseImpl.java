// Implementação do caso de uso
public class MonitoramentoTemperaturaUseCaseImpl implements MonitoramentoTemperaturaUseCase {

    private static final int LIMITE_TEMPERATURA = 30;

    public String monitorar(DataCenter dataCenter) {
        StringBuilder alertas = new StringBuilder();

        // Monitoramento das temperaturas das salas
        for (Sala sala : dataCenter.getSalas()) {
            if (sala.getTemperatura() > LIMITE_TEMPERATURA) {
                alertas.append("Alerta: Sala ").append(sala.getNumero()).append(" excedeu o limite de temperatura!").append(System.lineSeparator());
            }
        }

        // Verificação se houve algum alerta
        if (alertas.length() == 0) {
            return "Nenhuma sala excedeu o limite de temperatura.";
        } else {
            return alertas.toString();
        }
    }

}
