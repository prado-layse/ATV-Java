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

		return qtdCarne;
	}

}
