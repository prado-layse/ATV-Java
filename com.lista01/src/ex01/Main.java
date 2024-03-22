package ex01;

public class Main {

    public static void main(String[] args) {
		
		Churrasco c = new Churrasco();
		Pessoa p = new Pessoa("Layse", "Feminino", 25, true);
		
		p.mostrar(p);
		System.out.println("Consumo: " + c.verificarConsumo(p) + "KG \n");

		Pessoa p2 = new Pessoa("Juninho", "Masculino", 7, false);
		p.mostrar(p2);
		System.out.println("Consumo: " + c.verificarConsumo(p2) + "KG");


	}
}
