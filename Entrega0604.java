package array;

import java.util.Scanner;

public class Entrega0604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 2
		double par=0,somapar=0,impar=0,somaimpar=0,contp,conti;
		double[] vetor = new double [6];
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<6;x++) {
			System.out.println("Digite o "+(x+1)+" numero: ");
			vetor[x] = ler.nextDouble();
			
		}
		for(int x=0;x<6;x++) {
			if(vetor[x]%2==0) {
				System.out.println("Numeros pares: "+vetor[x]);
				somapar = somapar + vetor[x];
				
			}
		}	System.out.println("\nSoma dos numeros pares: "+somapar);	
		for(int x=0;x<6;x++) {
			if(vetor[x]%2==1) {
				System.out.println("\nNumeros impares: "+vetor[x]);
				impar++;
				
			}
		}System.out.println("\nQuantidade de numeros impares: "+impar);
		
		//Exercício 3
		int[][] valores = new int[3][3];
		float maiores=0;
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.println("\nDigite um número: ");
				valores[l][c] = ler.nextInt();
				if(valores[l][c]>10) {
					maiores ++;
				}
			}
		}
		
		System.out.println("\nValores maiores que 10: "+maiores);

	}

}
