package poo;

public class Cavalo extends Animal{
	private String correr;
	
	public Cavalo()
	{
		
	}
	public Cavalo(String nome,int idade,String emitir_som)
	{
		super(nome,idade,emitir_som);
	}
	public Cavalo(String nome,int idade,String emitir_som,String correr)
	{
		super(nome,idade,emitir_som);
		this.correr = correr;
	}
	public String getCorrer()
	{
		return correr;
	}
	public void setCorrer(String correr)
	{
		this.correr = correr;
	}

}
