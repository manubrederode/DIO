import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TableUpdate {

    private Map<Integer, String> table;

    public TableUpdate() {
        this.table = new HashMap<>();
        // Inserindo dados para exemplo
        table.put(1, "Alice");
        table.put(2, "Bob");
        table.put(3, "Charlie");
        table.put(4, "Debora");
        table.put(5, "Eduardo");
        table.put(6, "Fernanda");
    }

    public void insert(int key, String value) {
        table.put(key, value);
    }

    // Implementa o método update:
    public void update(int key, String newValue) {
        if (table.containsKey(key)) {
            table.put(key, newValue);
        } else {
            System.out.println("ID nao encontrado.");
        }
    }

    public void display() {
        for (String name : table.values()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TableUpdate table = new TableUpdate();

        int n = Integer.parseInt(scanner.nextLine().trim()); 

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(scanner.nextLine().trim()); 
            String newName = scanner.nextLine().trim(); 
            table.update(id, newName);
        }

        table.display();
        scanner.close();
    }
}
