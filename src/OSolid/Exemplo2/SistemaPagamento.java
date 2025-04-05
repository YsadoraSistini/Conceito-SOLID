package OSolid.Exemplo2;

public class SistemaPagamento {
    public void acionarpagamento(double valor, ISistemaPagamento metodoPagamento) {
        metodoPagamento.pagar(valor);
    }
}

