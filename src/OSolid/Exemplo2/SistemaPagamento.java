package OSolid.Exemplo2;

public class SistemaPagamento {
    public double pagar(double valor, ISistemaPagamento metodoPagamento) {
        return ISistemaPagamento.metodoPagamento(valor, metodo);
    }
}

