package desafio2;

import java.time.LocalTime;
import java.util.Scanner;

public class MeetingScheduler {

    // Horário mínimo e máximo permitidos para agendamento
    private static final LocalTime MIN_TIME = LocalTime.of(9, 0); 
    private static final LocalTime MAX_TIME = LocalTime.of(18, 0);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Recebe o horário desejado e o horário atual do sistema
        String desiredTimeInput = scanner.nextLine();
        LocalTime desiredTime = TimeFactory.createTime(desiredTimeInput);


        String currentTimeInput = scanner.nextLine();
        LocalTime currentTime = TimeFactory.createTime(currentTimeInput);


        // Verifica se o horário desejado está dentro do intervalo permitido
        if (isMeetingSchedulable(desiredTime)) {
            System.out.println("Reuniao pode ser agendada.");
        } else {
            System.out.println("Reuniao nao pode ser agendada. Horario fora do intervalo permitido.");
        }
    }

    // Método para verificar se a reunião pode ser agendada
    private static boolean isMeetingSchedulable(LocalTime desiredTime) {
        return !desiredTime.isBefore(MIN_TIME) && !desiredTime.isAfter(MAX_TIME);
    }
}
