import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double prova_1, prova_2, trab_1, trab_2, trab_3, media;

        System.out.printf("Prova 1: ");
        prova_1 = sc.nextDouble();

        System.out.printf("Prova 2: ");
        prova_2 = sc.nextDouble();

        System.out.printf("Trabalho 1: ");
        trab_1 = sc.nextDouble();

        System.out.printf("Trabalho 2: ");
        trab_2 = sc.nextDouble();

        System.out.printf("Trabalho 3: ");
        trab_3 = sc.nextDouble();

        media = (((prova_1 + prova_2) / 2) * 0.7) + ( ( (trab_1 + trab_2 + trab_3) /3) * 0.3);


        System.out.println("-----------------------------------");
        System.out.println("A média final: " + media);
        if (media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("-----------------------------------");
    }
}
