package ex01;

public class Churrasco {

    private double qtdCarne;
	Pessoa pessoa;
	
	
	public double verificarConsumo() {
		
		//Condição para zerar o consumo de pessoas vegetarianas ou menores de 3 anos;
		if(!pessoa.isVegetariana() || pessoa.getIdade() >= 0 & pessoa.getIdade() <=3) {
			
			if(pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12) {
				qtdCarne = 1;
			}else qtdCarne = 2;
		}
		return qtdCarne;
	}
	
	public void mostrar() {
		System.out.println("Consumo = " + qtdCarne);
	}

}
