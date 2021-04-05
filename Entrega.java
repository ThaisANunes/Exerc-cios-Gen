package repeticao;

import java.util.Scanner;

public class Entrega {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; //Exercício 1
		
		for(x=1000; x<=1999; x++)
		{
			if (x%11==5)
			{
				
				System.out.println(x);
			}
		}
		
		
		
		int idade=0,total1=0,total2=0; //Exercício 3
		
		Scanner ler = new Scanner(System.in);
		
		while(idade!=-99)
		{
			System.out.println("\nDigite sua idade: ");
			idade = ler.nextInt();
			
			if(idade<21) 
			{
				total1 = total1 + 1;
			}
			if(idade>50) 
			{
				total2 = total2 +1;
			}
			
		}
		System.out.println("Total com menos de 21 anos: "+total1+"\nTotal com mais de 50 anos: "+total2);
	
	
		
		int num,soma=0; //Exercício 5
		
		do
		{	
			System.out.println("\nDigite um numero do teclado: ");
			num = ler.nextInt();
			if(num>0);
			{				
				soma = soma + num;
			}
			
		}
		while (num!=0);
		
		System.out.println("Soma dos numeros: "+soma);
	}
}
