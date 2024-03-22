package ex02;

public class Lampada {
    private int qtd;
	private Estado estado;
	
	public Lampada() {
		//estado inicial apagada
		this.estado = Estado.apagada;
	}

	public void qtdAcendimentos() {
		qtd++;	
		System.out.println("Quantidade: " + qtd);
	}
	
	public void click() {
		if(estado == Estado.apagada) {
			estado = Estado.acesa;
			qtdAcendimentos();
		}else estado = Estado.apagada;
	}
	
	public void checaEstado() {
		System.out.println("Estado: " + this.estado);
	}
}
