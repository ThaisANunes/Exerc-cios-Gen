package poo;

public class Cavalo extends Animal{
		
	public Cavalo()
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
		System.out.println("POCOTÓ POCOTÓ");
	}
	@Override
	public void locomover()
	{
		System.out.println("Correndo");
	}
}
