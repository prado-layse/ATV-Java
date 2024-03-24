package ex04;

public class Main {

    public static void main(String[] args) {


        // Cadastro cliente 
        Cliente user = new Cliente("André", 1000 , 500);

        System.out.println("Nome do Usuário " + user.obterNome());
        System.out.println("Saldo do Usário: " + user.checarSaldo());
        user.depositar(50);
        user.sacar(1500);
        System.out.println("Saldo do Usário: " + user.checarSaldo());
    }
}
