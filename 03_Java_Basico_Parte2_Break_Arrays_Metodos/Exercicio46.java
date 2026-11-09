public class Exercicio46 {
    public static void main(String[] args) {
        String[] tentativas = {"", "abc", "", "senha123", "tarde"};
        String correta = "senha123";
        int usadas = 0;
        for (int i = 0; i < tentativas.length && usadas < 5; i++) {
            if (tentativas[i].isEmpty()) continue; // ignora vazias
            usadas++;
            if (tentativas[i].equals(correta)) {
                System.out.println("Senha correta na tentativa " + usadas);
                break;
            }
            System.out.println("Tentativa " + usadas + " incorreta");
        }
    }
}
