import java.util.Scanner;
/*Vamos solicitar como entrada dois numeros e depois vamos
 realizar uma operação simples entre eles. */

public class ope_mat {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede e captura os dados do usuário
        System.out.print("Digite o primeiro numero: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        Double num2 = scanner.nextDouble();

        // Realiza uma operação simples (ex: soma)
        double resultado = num1 + num2;

        // Exibe o resultado da operação matemática e fecha o scanner!
        System.out.println("Resultado " + resultado);
        scanner.close();


    }
}
