import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class DesempenhoTest {
	Scanner teclado = new Scanner(System.in);
	float consumo,consumomaior,consumomenor,velocidade,velocidademaior,velocidademenor,rpm,rpmmaior,rpmmenor,capacidade,capacidademaior,capacidademenor,tamanho,tamanhomaior,tamanhomenor;

	@Test
	public void test1() {
		System.out.println("INRORME O CONSUMO MAIOR");
		consumomaior = teclado.nextFloat();
		System.out.println("INRORME O CONSUMO MENOR");
		consumomenor = teclado.nextFloat();
		consumo = (consumomaior+consumomenor)/2;
		System.out.println("A MEDIA DE CONSUMO É:" + consumo);
	}
	@Test
	public void test2() {
		System.out.println("INRORME O VELOCIDADE MAIOR");
		velocidademaior = teclado.nextFloat();
		System.out.println("INRORME O CONSUMO MENOR");
		velocidademenor = teclado.nextFloat();
		velocidade = (velocidademaior+velocidademenor)/2;
		System.out.println("A MEDIA DE VELOCIDADE É:" + velocidade);
	}
	@Test
	public void test3() {
		System.out.println("INRORME O RPM MAIOR");
		rpmmaior = teclado.nextFloat();
		System.out.println("INRORME O RPM MENOR");
		rpmmenor = teclado.nextFloat();
		rpm = (rpmmaior+rpmmenor)/2;
		System.out.println("A MEDIA DE RPM É:" + rpm);
	}
	@Test
	public void test4() {
		System.out.println("INRORME O CAPACIDADE MAIOR");
		capacidademaior = teclado.nextFloat();
		System.out.println("INRORME O CAPACIDADE MENOR");
		capacidademenor = teclado.nextFloat();
		capacidade = (capacidademaior+capacidademenor)/2;
		System.out.println("A MEDIA DE CAPACIDADE É:" + capacidade);
	}
	@Test
	public void test5() {
		System.out.println("INRORME O TAMANHO MAIOR");
		tamanhomaior = teclado.nextFloat();
		System.out.println("INRORME O TAMANHO MENOR");
		tamanhomenor = teclado.nextFloat();
		tamanho = (tamanhomaior+tamanhomenor)/2;
		System.out.println("A MEDIA DE TAMANHO É:" + tamanho);
	}

}
