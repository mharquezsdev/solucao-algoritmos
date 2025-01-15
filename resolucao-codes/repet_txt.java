import java.util.Scanner;

public class repet_txt {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a string
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        // Solicita o número inteiro
        System.out.print("Digite um número inteiro: ");
        int vezes = scanner.nextInt();

        // Verifica se o número é positivo e, se sim, repete a string
        if (vezes > 0) {
            String resultado = texto.repeat(vezes);  // Repete a string
            System.out.println("String repetida: " + resultado);
        } else {
            System.out.println("O número deve ser maior que zero.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}

