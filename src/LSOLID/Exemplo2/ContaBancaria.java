package LSOLID.Exemplo2;

public class ContaBancaria implements ContaBasicaComSaque {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}


