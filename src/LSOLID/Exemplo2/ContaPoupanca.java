package LSOLID.Exemplo2;

public class ContaPoupanca implements ContaBasica {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    /*@Override
    public void sacar(double valor) {
        throw new UnsupportedOperationException("Resgate não é permitido direto.");
    }*/

}
