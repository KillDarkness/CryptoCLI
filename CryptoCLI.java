import java.util.Scanner;

public class CryptoCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistema de Criptografia ===");
            System.out.println("1. Escolher método e criptografar");
            System.out.println("2. Verificar criptografia");
            System.out.println("3. Salvar criptografia em arquivo");
            System.out.println("4. Carregar criptografia de arquivo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline

            if (choice == 1) {
                System.out.println("Escolha um método de criptografia:");
                System.out.println("1. Substituição (+3 posições)");
                System.out.println("2. Reversão do texto");
                System.out.println("3. ASCII multiplicado por 2");
                System.out.print("Método: ");
                int method = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o texto para criptografar: ");
                String input = scanner.nextLine();
                String encrypted = CryptoManager.encrypt(input, method);
                System.out.println("Texto criptografado: " + encrypted);
            } else if (choice == 2) {
                System.out.print("Digite o texto original: ");
                String input = scanner.nextLine();
                System.out.print("Digite o texto criptografado: ");
                String encrypted = scanner.nextLine();

                System.out.println("Escolha o método usado na criptografia:");
                System.out.println("1. Substituição (+3 posições)");
                System.out.println("2. Reversão do texto");
                System.out.println("3. ASCII multiplicado por 2");
                System.out.print("Método: ");
                int method = scanner.nextInt();
                scanner.nextLine();

                boolean isValid = CryptoManager.verify(input, encrypted, method);
                if (isValid) {
                    System.out.println("A criptografia está correta!");
                } else {
                    System.out.println("A criptografia está incorreta.");
                }
            } else if (choice == 3) {
                System.out.print("Digite o texto criptografado para salvar: ");
                String encrypted = scanner.nextLine();
                System.out.print("Digite o nome do arquivo: ");
                String filename = scanner.nextLine();

                if (Utils.saveToFile(filename, encrypted)) {
                    System.out.println("Texto salvo com sucesso!");
                } else {
                    System.out.println("Erro ao salvar o texto.");
                }
            } else if (choice == 4) {
                System.out.print("Digite o nome do arquivo para carregar: ");
                String filename = scanner.nextLine();
                String loaded = Utils.loadFromFile(filename);

                if (loaded != null) {
                    System.out.println("Texto carregado: " + loaded);
                } else {
                    System.out.println("Erro ao carregar o texto.");
                }
            } else if (choice == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
