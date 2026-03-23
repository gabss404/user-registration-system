import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cadastro de Usuário ===");

        String nome = lerNome(scanner);
        String cpf = lerCpf(scanner);
        int idade = lerIdade(scanner);
        double peso = lerPeso(scanner);
        double altura = lerAltura(scanner);

        exibirDados(nome, cpf, idade, peso, altura);

        scanner.close();
    }

    private static String lerNome(Scanner scanner) {
        System.out.print("Digite seu nome completo: ");
        return scanner.nextLine();
    }

    private static String lerCpf(Scanner scanner) {
        System.out.print("Digite seu CPF: ");
        return scanner.nextLine();
    }

    private static int lerIdade(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        return scanner.nextInt();
    }

    private static double lerPeso(Scanner scanner) {
        System.out.print("Digite seu peso (kg): ");
        return scanner.nextDouble();
    }

    private static double lerAltura(Scanner scanner) {
        System.out.print("Digite sua altura (m): ");
        return scanner.nextDouble();
    }

    private static void exibirDados(String nome, String cpf, int idade, double peso, double altura) {
        System.out.println("\n=== Dados Cadastrados ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }
}
