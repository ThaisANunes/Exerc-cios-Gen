package poo;

public class Preguica extends Animal{
	
	public Preguica()
	{
		
	}
	public String getNome()
	{
		return super.getNome();
	}
	public int getIdade()
	{
		return super.getIdade();
	}
	
	@Override
	public void emitir_som()
	{
		System.out.println("Grunhido");
	}
	@Override
	public void locomover()
	{
		System.out.println("Sobindo em árvore");
	}
	
	

}
