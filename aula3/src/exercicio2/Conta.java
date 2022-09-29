package exercicio2;

class Conta {
    int numero;
    double saldo;

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double getSaldo() {
        return this.saldo;
    }

    void creditar(double valor) {
        this.saldo = this.saldo + valor;
    }

    void debitar(double valor) {
        this.saldo = this.saldo - valor;
    }
}