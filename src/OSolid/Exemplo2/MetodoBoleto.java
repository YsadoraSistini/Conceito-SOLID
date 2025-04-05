package OSolid.Exemplo2;

public class MetodoBoleto implements ISistemaPagamento{
    @Override
    public void metodoPagamento (double valor, String metodo) {
        if ("BOLETO".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");
        }
    }
}
