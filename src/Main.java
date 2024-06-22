import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contagem.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {

            System.out.println("Parametro 2 não pode ser maior que parametro 1");
        }

    }

}