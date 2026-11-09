public class Exercicio34 {
    static int buscarIndice(String[] produtos, String procurado) {
        for (int i = 0; i < produtos.length; i++) if (produtos[i].equals(procurado)) return i;
        return -1;
    }
    public static void main(String[] args) {
        String[] p = {"Mouse", "Teclado", "Monitor"};
        System.out.println(buscarIndice(p, "Teclado"));
        System.out.println(buscarIndice(p, "Webcam"));
    }
}
