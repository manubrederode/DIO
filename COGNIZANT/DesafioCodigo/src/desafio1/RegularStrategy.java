package desafio1;

// Classe Concreta, RegularStrategy e sua lógica de avaliação aplicada
class RegularStrategy implements EvaluationStrategy {
    
    @Override
    public String evaluate(double average) {
        return average <= 6  && average >= 5 ? "Regular" : "";
    }
}
