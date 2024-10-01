package Target;
import java.util.Scanner;

public class VerificaLetraA {

    // Método para contar a quantidade de vezes que 'a' ou 'A' aparece na string
    public static int contarLetraA(String str) {
        int contador = 0;
        
        // Converte a string para minúscula para facilitar a contagem
        str = str.toLowerCase();
        
        // Percorre a string e conta quantas vezes a letra 'a' aparece
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da string pelo usuário
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();

        // Conta quantas vezes a letra 'a' aparece
        int quantidade = contarLetraA(entrada);

        // Exibe o resultado
        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}