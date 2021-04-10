package poo;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro animal1 = new Cachorro();
		animal1.setNome("Maya");
		animal1.setIdade(2);
		
		Cavalo animal2 = new Cavalo();
		animal2.setNome("Francisco");
		animal2.setIdade(6);	
		
		Preguica animal3 = new Preguica();		
		animal3.setNome("Prin");
		animal3.setIdade(8);		
		
		System.out.println("\n*****Características Cachorro*****");
		System.out.println("\nNome: "+animal1.getNome()+"\nIdade: "+animal1.getIdade());
		System.out.println("\nSom: ");
		animal1.emitir_som();
		System.out.println("\nLocomoção: ");
		animal1.locomover();
		
		System.out.println("\n*****Características Cavalo*****");
		System.out.println("\nNome: "+animal2.getNome()+"\nIdade: "+animal2.getIdade());
		System.out.println("\nSom: ");
		animal2.emitir_som();
		System.out.println("\nLocomoção: ");
		animal2.locomover();
		
		System.out.println("\n*****Características Preguiça*****");
		System.out.println("\nNome: "+animal3.getNome()+"\nIdade: "+animal3.getIdade());
		System.out.println("\nSom: ");
		animal3.emitir_som();
		System.out.println("\nLocomoção: ");
		animal3.locomover();
	}

}
