package poo;

public class Cachorro extends Animal {
	private String correr;
	
	public Cachorro()
	{
		
	}
	public Cachorro(String nome,int idade,String emitir_som)
	{
		super(nome,idade,emitir_som);
	}
	public Cachorro(String nome,int idade,String emitir_som,String correr)
	{
		super(nome,idade,emitir_som);
		this.correr = correr;
	}	
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	

}
