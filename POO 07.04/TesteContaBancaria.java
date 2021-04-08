package poo;

public class TesteContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta1 = new ContaBancaria("Bradesco","2403","55674","Melissa Nunes","45676534512",5000);
		
		conta1.imprimirInfo();
		
		System.out.println("******************************");
		System.out.println("\nDeposito Realizado");
		conta1.deposito(500);
		
		System.out.println("******************************");
		System.out.println("\nSaque Realizado");
		conta1.saque(400);
		
		
		

	}

}
