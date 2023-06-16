package br.mod10;
import java.util.Scanner;
public class Exemplo10 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.printf("informe a sua primeira nota:\n");
		double result = ler.nextDouble();
		System.out.printf("informe a sua segunda nota:\n");
		double result2 = ler.nextDouble();
		System.out.printf("informe a sua terceira nota:\n");
		double result3 = ler.nextDouble();
		System.out.printf("informe a sua quarta nota:\n");
		double result4 = ler.nextDouble();
		double media = (result+result2+result3+result4)/4;
		if (media >= 7  ) {
			System.out.println("Você foi aprovado! Sua nota é:"+media);
		} else if ( result >=5 && result < 7) {
			System.out.println("Você está em recuperação! Sua nota é: "+media);
		} else {
			System.out.println("Você foi reprovado! Sua nota é: "+media);
	}

}
}

