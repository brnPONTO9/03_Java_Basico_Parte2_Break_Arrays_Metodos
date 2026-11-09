public class Exercicio50 {
    static int buscarProduto(String[] produtos, String nome) {
        int idx = -1;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(nome)) { idx = i; break; }
        }
        return idx;
    }
    static double calcularSubtotal(double preco, int quantidade) { return preco * quantidade; }
    static double aplicarDesconto(double total, double percentual) { return total - total * percentual / 100; }
    public static void main(String[] args) {
        String[] produtos = {"Teclado", "Mouse", "Monitor", "Webcam"};
        double[] precos = {150, 80, 900, 250};
        int[] estoques = {5, 0, 3, 2};
        String[] pedido = {"Teclado", "Mouse", "Monitor", "Cabo"};
        int[] qtd = {2, 1, 1, 1};
        double total = 0;
        for (int i = 0; i < pedido.length; i++) {
            int idx = buscarProduto(produtos, pedido[i]);
            if (idx < 0) { System.out.println(pedido[i] + ": não encontrado"); continue; }
            if (estoques[idx] < qtd[i]) { System.out.println(pedido[i] + ": sem estoque"); continue; }
            double sub = calcularSubtotal(precos[idx], qtd[i]);
            System.out.printf("%s x%d = R$ %.2f%n", pedido[i], qtd[i], sub);
            total += sub;
        }
        double final_ = total >= 1000 ? aplicarDesconto(total, 10) : total;
        System.out.printf("Subtotal: R$ %.2f | Total da compra: R$ %.2f%n", total, final_);
    }
}
