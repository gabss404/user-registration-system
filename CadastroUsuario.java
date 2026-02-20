import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Boas-vindas
        System.out.println("Seja bem-vindo ao sistema de cadastro!");
        System.out.println("--------------------------------------");

        // Entrada de dados
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); // limpar buffer


        // Exibição dos dados
        System.out.println("\n------ DADOS CADASTRADOS ------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
      
         scanner.close();
    }
}
