package array;

import java.util.Scanner;

public class Entrega0604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 1
		int[] A = {1,0,5,-2,-5,7};
		int soma=0,mod,i;
		
		soma = A[0]+A[1]+A[5];
		System.out.println("Soma das posições 0, 1 e 5 = "+soma);
		
		A[4] = 100;
		System.out.println("Posição 4 agora é: "+A[4]);			
		
		for(i=0;i<6;i++) {				
			System.out.println("\nNa posição "+i+" está o "+A[i]+"\n");
		}
		
		//Exercício 3
		int[][] valores = new int[3][3];
		float maiores=0;
		
		Scanner ler = new Scanner(System.in);
		
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
