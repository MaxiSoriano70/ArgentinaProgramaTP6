import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calculadora;

	@BeforeEach
	public void serUp() {
		calculadora=new Calculadora();
	}
	
	@Test
	void testOne() {
		//El resultado de multiplicar 80 por 3 da 240
		double eje1=calculadora.multiplicar(80, 3);
		assertTrue(eje1==240);
	}
	
	@Test
	void testTwo(){
		//El resultado de sumar 150 y 180, dividido por 3, da 110:
		double aux1=calculadora.sumar(150, 180);
		double eje2=calculadora.dividir(aux1, 3);
		assertTrue(eje2==110);
	}
	
	@Test
	void testThree() {
		//El resultado de restar 90 y 50, multiplicado por 15, no da 605: 
		double aux2=calculadora.restar(90, 50);
		double eje3=calculadora.multiplicar(aux2, 15);
		assertTrue(eje3!=605);
	}
	
	@Test
	void testFour() {
		//El resultado de sumar 70 y 40, multiplicado por 25, no da 2700: 
		double aux3=calculadora.sumar(70, 40);
		double eje4=calculadora.multiplicar(aux3, 25);
		assertTrue(eje4!=270);
	}

}
