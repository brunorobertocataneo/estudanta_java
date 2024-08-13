import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        float resultado=0;
        char operacao;

        System.out.println("Digite o 1° número inteiro: ");
        x = sc.nextInt();

        System.out.println("Digite o 2° número inteiro: ");
        y = sc.nextInt();
        boolean valida;
        do{
        System.out.println("Qual operacao matematica deseja realizar?(+, -, *, /)");
        operacao = sc.next().charAt(0);
        valida = true;

        switch  (operacao) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = (float)x / y;
                break;
            default:
                System.out.println("Operação inválida. Tente navamente");
                valida = false;
        }
    while (valida == false) 
        System.out.println("O resultado da operacao e: " + resultado);
    }
        sc.close();
        }
}

