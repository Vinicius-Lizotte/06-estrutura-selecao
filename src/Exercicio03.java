import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double gv_totalcompra, gv_desconto, gv_economizado;

        System.out.printf("Valor total da compra: R$");
        gv_totalcompra = sc.nextDouble();

        if (gv_totalcompra > 1000){ // 15% Desconto
            gv_economizado = (gv_totalcompra * 0.15);
        } else { // 8% Desconto
            gv_economizado = (gv_totalcompra * 0.08);
        }

        gv_desconto = gv_totalcompra - gv_economizado;

        System.out.println("------------------------");
        System.out.println("Valor Final R$" + df.format(gv_desconto));
        System.out.println("Valor Economizado R$" + df.format(gv_economizado));
        System.out.println("------------------------");
    }
}
