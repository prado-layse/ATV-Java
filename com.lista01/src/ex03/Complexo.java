package ex03;

public class Complexo {

    private double a, b; // a(Parte real)   b(Parte imaginaria)


	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complexo soma(Complexo outro){
		double real = this.a + this.a;
		double imaginario = this.b + outro.b;
		return new Complexo(real,imaginario);
	}
	public Complexo multiplica(Complexo outro){
		double real = (this.a * outro.a)+(this.b * outro.b);
		double imaginaria = (this.a * outro.b) + (this.b * outro.a);
		return new Complexo(real,imaginaria);
	}
	// Método para representação em string do número complexo
	@Override
	public String toString() {
		return a + " + " + b + "i";
	}
}
