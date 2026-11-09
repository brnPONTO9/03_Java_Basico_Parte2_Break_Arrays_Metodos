public class Exercicio20 {
    public static void main(String[] args) {
        double[] salarios = {2500, 4800.50, 3200, 7100, 1900};
        double maior = salarios[0];
        for (double s : salarios) if (s > maior) maior = s;
        System.out.println("Maior salário: " + maior);
    }
}
