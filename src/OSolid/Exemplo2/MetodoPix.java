package OSolid.Exemplo2;

public class MetodoPix {

    public void metodoPagamento (double valor, String metodo) {
        if ("PIX".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
        }
    }
}
