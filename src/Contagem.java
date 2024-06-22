public class Contagem {
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("\nContagem\n");

        for (int i = 0; i < contagem; i++) {
            System.out.println(parametroUm + 1);
            parametroUm++;
        }
    }
}