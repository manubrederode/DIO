package desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEvaluation {

    private static final List<Double> evaluations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double evaluation1 = scanner.nextDouble();
        evaluations.add(evaluation1);

  
        double evaluation2 = scanner.nextDouble();
        evaluations.add(evaluation2);

        double average = calculateAverage(evaluations);

        EvaluationStrategy[] strategies = {
            new ExcellentStrategy(),
            new GoodStrategy(),
            new RegularStrategy(),
            new UnsatisfactoryStrategy()
        };

        String status = "";
        for (EvaluationStrategy strategy : strategies) {
            status = strategy.evaluate(average);
            if (!status.isEmpty()) {
                break;
            }
        }

        System.out.printf("Media: %.1f. Status: %s.%n", average, status);
    }

    private static double calculateAverage(List<Double> evaluations) {
        double sum = 0;
        for (double eval : evaluations) {
            sum += eval;
        }
        return sum / evaluations.size();
    }
}
