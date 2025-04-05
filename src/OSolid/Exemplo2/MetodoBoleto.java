package OSolid.Exemplo2;

public class MetodoBoleto implements ISistemaPagamento{
    @Override
    public void pagar (double valor) {
            System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");

    }
}
