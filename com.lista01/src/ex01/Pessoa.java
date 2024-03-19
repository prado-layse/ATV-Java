package ex01;

public class Pessoa {

    private String nome, sexo;
	private int idade;
	private boolean vegetariana;
	
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public boolean isVegetariana() {
		return vegetariana == true;
	}
	
	public void mostrar(){
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
	}

}
