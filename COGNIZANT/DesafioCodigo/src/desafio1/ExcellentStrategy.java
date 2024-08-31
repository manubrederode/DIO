package desafio1;

//Classe Concreta, ExcellentStrategy e sua lógica de resolução aplicada.
public class ExcellentStrategy implements EvaluationStrategy{

    @Override
    public String evaluate(double average) {
        return average >= 9 ? "Excelente" : "";
    }

}
