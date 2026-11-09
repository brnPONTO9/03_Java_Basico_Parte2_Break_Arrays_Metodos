public class Exercicio15 {
    public static void main(String[] args) {
        int noMain = 10; // visível em todo o main depois da declaração
        if (noMain > 5) {
            int dentroDoIf = 20; // visível apenas dentro deste bloco if
            System.out.println(noMain + dentroDoIf);
        }
        System.out.println(noMain);
        // System.out.println(dentroDoIf); // erro: variável fora do escopo
    }
}
