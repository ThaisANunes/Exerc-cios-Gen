import java.util.Scanner;
public class Entrega {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int n1,n2,n3,m; // Exercicio 1
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero inteiro: ");
	n1 = leia.nextInt();
	System.out.println("Digite o segundo numero inteiro: ");
	n2 = leia.nextInt();
	System.out.println("Digite o terceiro numero inteiro: ");
	n3 = leia.nextInt();
	
	if (n1 > n2)
	{
		if(n1 > n3)
			m = n1;
		else
			m = n3;				
	}
	else
	{
		if(n2 > n3)
			m = n2;
		else
			m = n3;
	}
	
	System.out.println("O maior numero é: "+m+"\n");
	
	
	int id; //Exercicio 3
	
	Scanner leia1 = new Scanner(System.in);
	
	System.out.println("\nDigite a idade: ");
	id = leia1.nextInt();
	
	if(id>=10  &&  id<=14)
	{
		System.out.println("Categoria infantil!");
	}
	else if(id>=15  &&  id<=17)
	{
		System.out.println("Categoria Juvenil!");
	}
	else if(id>=18  &&  id<=25)
	{
		System.out.println("Categoria Adulto!");
	}
	else
	{
		System.out.println("Idade fora do padrão...!");
	}
		
	}
				
}
