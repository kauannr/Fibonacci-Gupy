import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numero para verificar a sequencia de fibonacci: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (pertenceAFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean pertenceAFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true; // 0 e 1 sempre pertencem à sequência
        }

        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return numero == atual;
    }
}
