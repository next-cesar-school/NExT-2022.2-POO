package exercicio2;

public class MainConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c2.numero = 654321;
        c1.setSaldo(100.00);
        c1.numero = 123456;
        double saldoC1 = c1.getSaldo();
        System.out.println(saldoC1);
        System.out.println(c1.numero);
        c1.creditar(100.0);
        saldoC1 = c1.getSaldo();
        System.out.println(saldoC1);
        c1.debitar(150.0);
        saldoC1 = c1.getSaldo();
        System.out.println(saldoC1);
        c2.creditar(1000.00);
        System.out.println(c2.getSaldo());
    }
}
