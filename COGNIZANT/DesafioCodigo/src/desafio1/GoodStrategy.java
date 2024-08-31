package desafio1;

//Classe Concreta, GoodStrategy e sua lógica de avaliação aplicada
class GoodStrategy implements EvaluationStrategy {
    
    @Override
    public String evaluate(double average) {
       return average >= 7 && average <= 10 ? "Bom" : "";
    }
}
