package ex04;

public class Cliente {

    private String nome;
	private double saldo, limite;

	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void sacar(double valor){

		if (valor<0){
			System.out.println("ERRO: Valor inválido");
		}else{
			if(valor>(saldo+limite)){
				System.out.println("Você não tem saldo para sacar");
			}else{
				System.out.printf("Saque realizado com sucesso no valor de : R$ %.2f%nSaldo atual: R$ %.2f%n",  valor  , ((saldo + limite)- valor ));
			}
		}
	}
	public void depositar(double valor){

		if (valor<1){
			System.out.println("ERRO: Valor inválido");
		}else{
			System.out.printf("Depósito realizado com sucesso no valor de : R$ %.2f%nSaldo atual: R$ %.2f%n", valor , ((saldo + limite)+ valor ));
		}
	}
	public double checarSaldo(){

		return saldo+limite;

	}
	public String obterNome(){

		return nome;
	}
}
