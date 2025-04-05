package OSolid.Exemplo2;

public class MetodoNaoSuportado {
    public void metodoPagamento (double valor, String metodo) {
        if (!metodo.equalsIgnoreCase(metodo)) {
            System.out.println("Método de pagamento não suportado!");
        }
    }
}
