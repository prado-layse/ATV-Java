package ex04;

public class Main {

    public static void main(String[] args) {


        // Criando dois números complexos
        Cliente user = new Cliente("André", 4.59 , 15.70);

        user.sacar(9.56);
        user.depositar(52.96);
        System.out.println("Saldo do Usário: " + user.checarSaldo());
        System.out.println("Nome do Usuário: " + user.obterNome());




    }
}
