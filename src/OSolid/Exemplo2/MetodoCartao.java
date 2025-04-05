package OSolid.Exemplo2;

public class MetodoCartao implements ISistemaPagamento{
    @Override
    public void metodoPagamento (double valor, String metodo) {
        if ("CARTAO".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via CARTAO.");
        }
    }
}