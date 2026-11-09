public class Exercicio16 {
    public static void main(String[] args) {
        int[] v = {12, 25, 30, 44, 58};
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 44) {
                System.out.println("Encontrado 44 na posição " + i);
                break;
            }
        }
    }
}
