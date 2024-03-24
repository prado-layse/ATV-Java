package ex04;

public class Cliente {

    private String nome;
	private double saldo, limite;

	//construtor de cliente
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	//metodo para sacar o dinheiro
	public void sacar(double valor){

		if (valor < 0){
			System.out.println("ERRO: Valor inválido. Tente novamente!");
		}else{
			if(saldo + valor >= valor){
				saldo -= valor;
				System.out.println("Saque efetuado no valor de R$ " + valor);
			}else{
				System.out.println("Saque insuficiente");
			}
		}
	}

	//metodo para depositar o dinheiro
	public void depositar(double valor){

		if (valor <= 0){
			System.out.println("ERRO: Valor inválido. Tente novamente!");
		}else{
			saldo += valor;
			System.out.println("Deposito efetuado no valor de:R$ " + valor);
		}
	}

	//metodo para checar saldo do cliente
	public double checarSaldo(){
		return saldo + limite;
	}

	public String obterNome(){
		return nome;
	}
}
