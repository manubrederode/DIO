// Implementação do controlador
public class MonitoramentoTemperaturaController {

    private final MonitoramentoTemperaturaUseCase useCase;
    private final MonitoramentoTemperaturaPresenter presenter;

    public MonitoramentoTemperaturaController(MonitoramentoTemperaturaUseCase useCase, MonitoramentoTemperaturaPresenter presenter) {
        this.useCase = useCase;
        this.presenter = presenter;
    }

    public void monitorar(DataCenter dataCenter) {
        String resultado = useCase.monitorar(dataCenter);
        presenter.apresentarResultado(resultado);
    }

}
