// Classe principal que funciona como interface de entrada/saída e execução do caso de uso

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonitoramentoTemperatura implements MonitoramentoTemperaturaPresenter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Leitura do número de salas
        int numeroSalas = scanner.nextInt();


        // Leitura das temperaturas das salas
        List<Sala> salas = new ArrayList<>();
        for (int i = 0; i < numeroSalas; i++) {
            int temperatura = scanner.nextInt();
            salas.add(new Sala(i + 1, temperatura));
        }


        // Criação da entidade DataCenter
        DataCenter dataCenter = new DataCenter(salas);


        // Criação e execução do caso de uso
        MonitoramentoTemperaturaUseCase useCase = new MonitoramentoTemperaturaUseCaseImpl();


        // Criação e execução do apresentador
        MonitoramentoTemperaturaPresenter presenter = new MonitoramentoTemperatura();


        // Criação do controlador
        MonitoramentoTemperaturaController controller = new MonitoramentoTemperaturaController(useCase, presenter);


        // Execução do controlador
        controller.monitorar(dataCenter);


        scanner.close();
    }

    @Override
    public void apresentarResultado(String resultado) {
        System.out.println(resultado);
    }

}
