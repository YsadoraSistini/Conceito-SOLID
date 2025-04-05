package OSolid.Exemplo2;

public class MetodoPix implements ISistemaPagamento{
    @Override
    public void pagar (double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");

    }
}