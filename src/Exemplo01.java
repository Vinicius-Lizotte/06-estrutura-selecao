import java.text.DecimalFormat;
import java.util.Scanner;

// Programa Exemplo de calcular média entre duas notas
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double gv_nota1, gv_nota2, gv_notamedia;

        System.out.printf("Primeira Nota: ");
        gv_nota1 = sc.nextDouble();

        System.out.printf("Segunda Nota: ");
        gv_nota2 = sc.nextDouble();

        gv_notamedia = (gv_nota1 + gv_nota2) / 2;


        System.out.println("---------------------------");
        System.out.println("Nota final: " + df.format(gv_notamedia));

        if (gv_notamedia >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("---------------------------");
    }
}
