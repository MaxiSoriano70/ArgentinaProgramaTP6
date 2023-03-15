
public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora=new Calculadora();
		double eje1=calculadora.multiplicar(80, 3);
		System.out.println("El resultado de multiplicar 80 por 3 da 240: "+eje1);
		
		double aux1=calculadora.sumar(150, 180);
		double eje2=calculadora.dividir(aux1, 3);
		System.out.println("El resultado de sumar 150 y 180, dividido por 3, da 110: "+eje2);
		
		double aux2=calculadora.restar(90, 50);
		double eje3=calculadora.multiplicar(aux2, 15);
		System.out.println("El resultado de restar 90 y 50, multiplicado por 15, no da 605: "+eje3);
		
		double aux3=calculadora.sumar(70, 40);
		double eje4=calculadora.multiplicar(aux3, 25);
		System.out.println("El resultado de sumar 70 y 40, multiplicado por 25, no da 2700: "+eje4);
		
	}

}
