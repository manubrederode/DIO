
import java.util.Scanner;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {
        // Expressão regular para validar o formato do endpoint
        String regex = "^/api/\\w+(/\\w+)*$";
        
        // Verifica se o endpoint corresponde à expressão regular
        if (endpoint.matches(regex)) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}