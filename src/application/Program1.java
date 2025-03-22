package application;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas serão digitadas? ");
		int n = sc.nextInt();
		
		double soma = 0.0;
		for(int i =0; i<n; i++) {
			System.out.printf("Digite a #%d nota: ", i+1);
			double nota = sc.nextDouble();
			soma = soma + nota;
			
		}
		double media = soma/n;
				
		System.out.println("A media do aluno foi: " + media);
		
		if(media >= 6.0) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		
		
		
		
		sc.close();

	}

}
