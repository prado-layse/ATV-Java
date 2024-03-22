package ex03;

public class Complexo {

    private double a, b; // a(Parte real)   b(Parte imaginaria)


	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complexo soma(Complexo outro){
		double real = this.a + outro.a;
		double imaginario = this.b + outro.b;
		return new Complexo(real,imaginario);
	}
	public Complexo multiplica(Complexo outro){
		double real = Math.sqrt(Math.pow((this.a * outro.a),2) + Math.pow((this.b * outro.b),2));
		double imaginaria = (this.a * outro.b) + (this.b * outro.a);
		return new Complexo(real,imaginaria);
	}
	public double modulo() {
		return Math.sqrt(a * a + b * b);
	}
	public double argumentoPrincipal() {
		return Math.atan2(b, a);
	}
	@Override
	public String toString() {
		return a + " + " + b + "i";
	}
}
