package ex01;

public class Pessoa {

    private String nome, sexo;
	private int idade;
	private boolean vegetariana;
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	public int getIdade() {
		return idade;
	}

	public boolean isVegetariana() {
		return vegetariana;
	}
	
	public void mostrar(Pessoa p){
		System.out.println("Nome: " + p.nome);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Idade: " + p.idade);
		System.out.println("Vegetariana: " + (p.vegetariana ? "Sim" : "Não"));

	}

}
