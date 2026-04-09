import java.util.Scanner;

public class Maino {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PagamentoContext context = new PagamentoContext();

        System.out.println("SISTEMA DI PAGAMENTO");
        System.out.println("1 - Carta di Credito");
        System.out.println("2 - PayPal");
        System.out.print("Scegli il metodo di pagamento: ");
        int scelta = scanner.nextInt();

        System.out.print("Inserisci l'importo da pagare: ");
        double importo = scanner.nextDouble();

        switch (scelta) {
            case 1:
                context.setMetodoPagamento(new CartaDiCredito());
                break;
            case 2:
                context.setMetodoPagamento(new PayPal());
                break;
            default:
                System.out.println("Metodo di pagamento non valido.");
                scanner.close();
                return;
        }

        context.eseguiPagamento(importo);

        scanner.close();
    }
}