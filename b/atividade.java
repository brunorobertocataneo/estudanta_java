import java.util.Scanner;
public class atividade {
    
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu primeiro número: ");
        int i1 = teclado.nextInt();

        System.out.print("Informe seu segundo número: ");
        int i2 = teclado.nextInt();

        System.out.print("Resultado : ");
        System.out.println( i1 + i2);
    }
    
}
