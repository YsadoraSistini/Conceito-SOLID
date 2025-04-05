package OSolid.Exemplo2;

public class MainPagamento {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        sistema.acionarpagamento(1500.0, new MetodoBoleto());
        sistema.acionarpagamento(569.8, new MetodoCartao());
        sistema.acionarpagamento(2770.0, new MetodoPix());

    }
}
