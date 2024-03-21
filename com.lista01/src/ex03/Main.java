package ex03;

public class Main {

    public static void main(String[] args) {


        // Criando dois números complexos
        Complexo complexo1 = new Complexo(3, 2);
        Complexo complexo2 = new Complexo(1, 4);

        // Somando os números complexos
        Complexo resultadoSoma = complexo1.soma(complexo2);
        System.out.println("Soma: " + resultadoSoma);

        // Multiplicando os números complexos
        Complexo resultadoMultiplicacao = complexo1.multiplica(complexo2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);


    }
}
