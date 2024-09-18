import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Funcionario> funcionarios = new ArrayList<>();

        // Leitura dos dados dos funcionários
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        // Leitura do percentual de aumento
        double aumento = scanner.nextDouble();

        // Atualização dos salários e impressão dos resultados
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            double novoSalario = funcionario.salario * (1 + aumento / 100);
            System.out.printf("Nome: %s - Novo Salario: %.2f\n", funcionario.nome, novoSalario);
        }

        scanner.close();
    }
}

class Funcionario {
    String nome;
    String departamento;
    double salario;

    Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}