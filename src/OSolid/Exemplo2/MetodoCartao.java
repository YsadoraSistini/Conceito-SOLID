package OSolid.Exemplo2;

public class MetodoCartao implements ISistemaPagamento{
        @Override
        public void pagar (double valor) {
            System.out.println("Pagamento de R$" + valor + " realizado via CARTAO.");

        }
    }
