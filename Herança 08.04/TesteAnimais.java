package poo;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro animal1 = new Cachorro();
		Cavalo animal2 = new Cavalo();
		Preguica animal3 = new Preguica();
		
		animal1.setNome("Maya");
		animal1.setIdade(1);
		animal1.setEmitir_som("AUAU");
		animal1.setCorrer("Corre");
		
		animal2.setNome("Francisco");
		animal2.setIdade(6);
		animal2.setEmitir_som("POCOT�");
		animal2.setCorrer("Galope");
		
		animal3.setNome("Prin");
		animal3.setIdade(8);
		animal3.setEmitir_som("Barulho de mastiga��o");
		animal3.setSubir_em_arvores("Sobe em arvores");
		
		System.out.println("\nNome do Cachorro: "+animal1.getNome()+"\nIdade: "+animal1.getIdade()+"\nSom do animal: "+animal1.getEmitir_som()+"\nQual a��o do animal: "+animal1.getCorrer());
		System.out.println("\nNome do Cavalo: "+animal2.getNome()+"\nIdade: "+animal2.getIdade()+"\nSom do animal: "+animal2.getEmitir_som()+"\nQual a��o do animal: "+animal2.getCorrer());
		System.out.println("\nNome da Pregui�a: "+animal3.getNome()+"\nIdade: "+animal3.getIdade()+"\nSom do animal: "+animal3.getEmitir_som()+"\nQual a��o do animal: "+animal3.getSubir_em_arvores());
	}

}
