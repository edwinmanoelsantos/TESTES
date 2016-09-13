import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class CalcularTest {

	Scanner teclado = new Scanner(System.in);
	int n1 = 10;
	int n2 = 5;
	int n3;
	int soma;
	int subtracao;
	int multiplicacao;
	int divisao;
	int produto1;
	int produto2;

	@Test
	public void test1() {
		soma = n1 + n2;
		System.out.println("A SOMA DOS DOIS VALORES É:" + soma);
	}

	@Test
	public void test2() {
		subtracao = n1 - n2;
		System.out.println("A SUBTRAÇAO DOS DOIS VALORES É:" + subtracao);

	}

	@Test
	public void test3() {
		multiplicacao = n1 * n2;
		System.out.println("A MULTIPLICAÇÃO DOS DOIS VALORES É:" + multiplicacao);
	}

	@Test
	public void test4() {
		divisao = n1 / n2;
		System.out.println("A DIVISAO DOS DOIS VALORES É:" + divisao);

	}

	@Test
	public void test5() {
		produto1 = n1 * n1;
		System.out.println("O PRODUTO DO 1° NUMERO É:" + produto1);

		produto2 = n2 * n2;
		System.out.println("O PRODUTO DO 2° NUMERO É:" + produto2);

	}

}
