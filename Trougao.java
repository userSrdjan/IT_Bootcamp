package Mart_08_apstrakcija;

public abstract class Trougao {
	
	private double a;
	private double b;
	private double c;
	
	public double obim() {
		return a+b+c;
	}
	
	public abstract double povrsina();
	
	
	
	
	@Override
	public String toString() {
		return "T("+a+","+"b"+","+c+")";
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	
}
