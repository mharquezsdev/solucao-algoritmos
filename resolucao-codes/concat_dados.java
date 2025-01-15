import java.util.Scanner;

/*Vamos receber dois dados diferentes 
do usuario e concatena-los em uma única string. */

public class concat_dados {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
          // Pede e captura os dados do usuário
        System.out.print("Digite o primeiro dado! ");
        String dado1 = scanner.nextLine();
        System.out.print("Digite o segundo dado!");
        String dado2 = scanner.nextLine();

        // Concatena os dois dados
        String resultado = dado1+" e "+dado2;

        // Exibe o resultado concatenado e fecha o scanner!
        System.out.println("Resultado concatenado: " + resultado);
        scanner.close();
    }
}

