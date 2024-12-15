public class CryptoManager {
    // Criptografar com base no método escolhido
    public static String encrypt(String input, int method) {
        switch (method) {
            case 1:
                return substitutionEncrypt(input);
            case 2:
                return reverseEncrypt(input);
            case 3:
                return asciiEncrypt(input);
            default:
                throw new IllegalArgumentException("Método inválido.");
        }
    }

    // Descriptografar com base no método escolhido
    public static String decrypt(String encrypted, int method) {
        switch (method) {
            case 1:
                return substitutionDecrypt(encrypted);
            case 2:
                return reverseDecrypt(encrypted);
            case 3:
                return asciiDecrypt(encrypted);
            default:
                throw new IllegalArgumentException("Método inválido.");
        }
    }

    // Verificar criptografia
    public static boolean verify(String input, String encrypted, int method) {
        return input.equals(decrypt(encrypted, method));
    }

    // Método 1: Substituição (+3 posições)
    private static String substitutionEncrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    private static String substitutionDecrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            decrypted.append((char) (c - 3));
        }
        return decrypted.toString();
    }

    // Método 2: Reversão do texto
    private static String reverseEncrypt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private static String reverseDecrypt(String encrypted) {
        return new StringBuilder(encrypted).reverse().toString();
    }

    // Método 3: ASCII multiplicado por 2
    private static String asciiEncrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            encrypted.append((int) c * 2).append(" ");
        }
        return encrypted.toString().trim();
    }

    private static String asciiDecrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        String[] codes = encrypted.split(" ");
        for (String code : codes) {
            decrypted.append((char) (Integer.parseInt(code) / 2));
        }
        return decrypted.toString();
    }
}
