package Target;
import java.util.Scanner;


public class FibonacciChecker {

    // Método para verificar se o número informado pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        // Dois primeiros números da sequência
        int a = 0;
        int b = 1;
        
        // Se o número é 0 ou 1, ele pertence à sequência
        if (num == 0 || num == 1) {
            return true;
        }
        
        // Gera os próximos números da sequência até encontrar ou ultrapassar o número informado
        int next = a + b;
        while (next <= num) {
            if (next == num) {
                return true;  // O número pertence à sequência
            }
            a = b;
            b = next;
            next = a + b;
        }
        
        // O número não foi encontrado na sequência
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número a ser verificado
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}