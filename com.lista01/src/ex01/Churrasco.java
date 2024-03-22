package ex01;

public class Churrasco {

    private double qtdCarne;

	
	public double verificarConsumo(Pessoa pessoa) {

		if (pessoa.isVegetariana() || pessoa.getIdade() >= 0 && pessoa.getIdade() <4){

			qtdCarne = 0;

		}else {

			if (pessoa.getIdade() >= 4 && pessoa.getIdade() <13){

				qtdCarne = 1;

			}else if (pessoa.getIdade() > 12){

				qtdCarne = 2;

			}else {

				System.out.println("ERRO");
			}
		}


//		//Condição para zerar o consumo de pessoas vegetarianas ou menores de 3 anos;
//		if(!pessoa.isVegetariana() || pessoa.getIdade() >= 0 & pessoa.getIdade() <=3) {
//
//			if(pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12) {
//				qtdCarne = 1;
//			}else qtdCarne = 2;
//		}
		return qtdCarne;
	}
	
	public void mostrar() {
		System.out.println("Consumo = " + qtdCarne);
	}

}
