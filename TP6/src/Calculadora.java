
public class Calculadora {

	public Calculadora() {
		
	}
	
	public double sumar(double num1,double num2) {
		return (num1+num2);
	}
	
	public double restar(double num1,double num2) {
		return (num1-num2);
	}
	
	public double multiplicar(double num1,double num2) {
		return (num1*num2);
	}
	
	@SuppressWarnings("finally")
	public double dividir(double num1,double num2) {
		double aux=0;
		try {
			aux=num1/num2;
		}
		catch(ArithmeticException ex) {
			aux=0;
			System.out.println("Error: "+ex);
		}finally {
			return aux;
		}
	}
}
