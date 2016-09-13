import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class NotasTest {
	Scanner teclado = new Scanner(System.in);
	float n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,r1,r2,r3,r4,rf;

	@Test
	public void test1() {
		System.out.println("INFORME A 1° NOTA:");
		n1 = teclado.nextFloat();
		System.out.println("INFORME A 2° NOTA:");
		n2 = teclado.nextFloat();
		r1 = (n1+n2)/2;
		System.out.println("MEDIA DA 1°RODADA:"+ r1 );
	}
	@Test
	public void test2() {
		System.out.println("INFORME A 3° NOTA:");
		n3 = teclado.nextFloat();
		System.out.println("INFORME A 4° NOTA:");
		n4 = teclado.nextFloat();
		r2 = (n3+n4)/2;
		System.out.println("MEDIA DA 2°RODADA:"+ r2 );
	}
	@Test
	public void test3() {
		System.out.println("INFORME A 5° NOTA:");
		n5 = teclado.nextFloat();
		System.out.println("INFORME A 6° NOTA:");
		n6 = teclado.nextFloat();
		r3 = (n5+n6)/2;
		System.out.println("MEDIA DA 3°RODADA:"+ r3 );
	}
	@Test
	public void test4() {
		System.out.println("INFORME A 7° NOTA:");
		n7 = teclado.nextFloat();
		System.out.println("INFORME A 8° NOTA:");
		n8 = teclado.nextFloat();
		r4 = (n7+n8)/2;
		System.out.println("MEDIA DA 4°RODADA:"+ r4 );
	}
	@Test
	public void test5() {
		System.out.println("INFORME A 9° NOTA:");
		n9 = teclado.nextFloat();
		System.out.println("INFORME A 10° NOTA:");
		n10 = teclado.nextFloat();
		rf = (n9+n10)/2;
		System.out.println("MEDIA DA RODADA FINAL:"+ rf );
	}

}
