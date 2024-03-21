package ex04;

public class Main {

    public static void main(String[] args) {


        // Criando dois números complexos
        Cliente complexo1 = new Cliente(3, 2);
        Cliente complexo2 = new Cliente(1, 4);

        // Somando os números complexos
        Cliente resultadoSoma = complexo1.soma(complexo2);
        System.out.println("Soma: " + resultadoSoma);

        // Multiplicando os números complexos
        Cliente resultadoMultiplicacao = complexo1.multiplica(complexo2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        // Calculando o módulo e o argumento principal
        double modulo = complexo1.modulo();
        double argumentoPrincipal = complexo1.argumentoPrincipal();

        System.out.printf("Módulo: %.2f%n", modulo);
        System.out.printf("Argumento Principal: %.2f%n", argumentoPrincipal);

    }
}
