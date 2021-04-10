package poo;

public class Cachorro extends Animal {
	
	public Cachorro()
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
		System.out.println("AU AU AU AU");		
	}
	@Override
	public void locomover()
	{
		System.out.println("Correndo");
	}
	
	

}
