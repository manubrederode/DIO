package desafio1;

// Classe Concreta, UnsatisfactoryStrategy e sua lógica de avaliação aplicada
class UnsatisfactoryStrategy implements EvaluationStrategy {
    
    @Override
    public String evaluate(double average) {
        return average < 5 ? "Insatisfatorio" : "";
    }
}
