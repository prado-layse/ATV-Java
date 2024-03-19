package ex01;

public class Main {

    public static void main(String[] args) {
		
		Churrasco c;
		Pessoa p = new Pessoa("Layse", "Feminino", 25);
		
		p.mostrar();
		System.out.println("Consumo: " + c.verificarConsumo());

	}
}
