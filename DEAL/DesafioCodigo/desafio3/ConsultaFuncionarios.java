import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsultaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, List<Funcionario>> departamentoFuncionarios = new HashMap<>();

        // Le os dados dos funcionarios
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            // Adiciona o funcionário ao departamento correspondente
            departamentoFuncionarios.computeIfAbsent(departamento, k -> new LinkedList<>()).add(new Funcionario(nome, salario));

        }

       
        String departamentoConsulta = scanner.nextLine();
        
        List<Funcionario> funcionarios = departamentoFuncionarios.getOrDefault(departamentoConsulta, new LinkedList<>());
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s - Salario: %.2f\n", f.nome, f.salario);
        }

        scanner.close();
    }
}

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
