import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j;
        int maiorNota; 
        float 2
        ;

        System.out.println("Digite a 1° nota : ");
        a = sc.nextInt();
        maiorNota = a; 

        System.out.println("Digite a 2° nota: ");
        b = sc.nextInt();
        if (b > maiorNota) {
            maiorNota = b; 
        }
        
        System.out.println("Digite a 3° nota: ");
        c = sc.nextInt();
        if (c > maiorNota) {
            maiorNota = c;
        }

        System.out.println("Digite a 4° nota: ");
        d = sc.nextInt();
        if (d > maiorNota) {
            maiorNota = d;
        }

        System.out.println("Digite a 5° nota: ");
        e = sc.nextInt();
        if (e > maiorNota) {
            maiorNota = e;
        }

        System.out.println("Digite a 6° nota: ");
        f = sc.nextInt();
        if (f > maiorNota) {
            maiorNota = f;
        }

        System.out.println("Digite a 7° nota: ");
        g = sc.nextInt();
        if (g > maiorNota) {
            maiorNota = g;
        }

        System.out.println("Digite a 8° nota: ");
        h = sc.nextInt();
        if (h > maiorNota) {
            maiorNota = h;
        }

        System.out.println("Digite a 9° nota: ");
        i = sc.nextInt();
        if (i > maiorNota) {
            maiorNota = i;
        }

        System.out.println("Digite a 10° nota: ");
        j = sc.nextInt();
        if (j > maiorNota) {
            maiorNota = j;
        }

        sc.close();

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A media da turma é: " + (a+ b+ c + d+ e + f + g + h +i + j)/10);
    }
}
